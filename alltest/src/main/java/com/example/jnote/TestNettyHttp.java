package com.example.jnote;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.*;
import javax.net.ssl.SSLContext;
import io.netty.handler.ssl.SslHandler;
import io.netty.handler.stream.ChunkedStream;
import io.netty.handler.stream.ChunkedWriteHandler;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.security.NoSuchAlgorithmException;

public class TestNettyHttp {
    public static void main(String[] args) {
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // (1)
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap(); // (2)
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class) // (3)
                    .childHandler(new ZeroCopyWriteHandlerInitializer(
                            new File("/Users/huqingfeng/Documents/doc/jnote/log.log")
                    ))
                    .option(ChannelOption.SO_BACKLOG, 128)          // (5)
                    .childOption(ChannelOption.SO_KEEPALIVE, false); // (6)

            // Bind and start to accept incoming connections.
            ChannelFuture f = b.bind(8080).sync(); // (7)

            // Wait until the server socket is closed.
            // In this example, this does not happen, but you can do that to gracefully
            // shut down your server.
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }


    /**
     *  http test
     */
    public static  class HttpAggregatorInitializer extends ChannelInitializer<Channel> {

        @Override
        protected void initChannel(Channel ch) throws Exception {
            ChannelPipeline pipeline = ch.pipeline();
            pipeline
                    .addLast("codec", new HttpServerCodec())
                    .addLast("compressor",new HttpContentCompressor())
                    .addLast("aggregator", new HttpObjectAggregator(100 * 1024 * 1024))
                    .addLast("cutom",new Custom());
        }

        private class Custom extends SimpleChannelInboundHandler{
            @Override
            protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
                if (!(msg instanceof FullHttpRequest)) {
                    return;
                }

                final FullHttpRequest request = (FullHttpRequest) msg;
                final FullHttpResponse response = new DefaultFullHttpResponse(
                        HttpVersion.HTTP_1_1,
                        HttpResponseStatus.OK,
                        Unpooled.wrappedBuffer(request.uri().getBytes()),
                        false);
                ctx.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
            }
        }

    }

    /**
     *  file test
     */
    public  static  class ChunkedWriteHandlerInitializer extends ChannelInitializer<Channel> {
        private final File file;
        private final SSLContext sslCtx;

        public ChunkedWriteHandlerInitializer(File file, SSLContext sslCtx) {
            this.file = file;
            this.sslCtx = sslCtx;
        }

        @Override
        protected void initChannel(Channel ch) throws Exception {
            ChannelPipeline pipeline = ch.pipeline();
//            pipeline.addLast(new SslHandler(sslCtx.createSSLEngine())); //1
            pipeline.addLast(new ChunkedWriteHandler());//2
            pipeline.addLast(new WriteStreamHandler());//3
        }

        public final class WriteStreamHandler extends ChannelInboundHandlerAdapter {  //4

            @Override
            public void channelActive(ChannelHandlerContext ctx) throws Exception {
                super.channelActive(ctx);
                ctx.writeAndFlush(new ChunkedStream(new FileInputStream(file)));
            }
        }
    }

    /**
     *  file zero copy test
     */
    public  static  class ZeroCopyWriteHandlerInitializer extends ChannelInitializer<Channel> {

        private final File file;

        public ZeroCopyWriteHandlerInitializer(File file) {
            this.file = file;
        }

        @Override
        protected void initChannel(Channel ch) throws Exception {
            ChannelPipeline pipeline = ch.pipeline();
            pipeline.addLast(new WriteStreamHandler());//3
        }

        public final class WriteStreamHandler extends ChannelInboundHandlerAdapter {  //4

            @Override
            public void channelActive(ChannelHandlerContext ctx) throws Exception {
                super.channelActive(ctx);
                FileInputStream in = new FileInputStream(file); //1
                FileRegion region = new DefaultFileRegion(in.getChannel(), 0, file.length());
                ctx.writeAndFlush(region);
            }
        }
    }


}
