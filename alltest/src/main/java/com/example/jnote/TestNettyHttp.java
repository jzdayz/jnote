package com.example.jnote;

import com.server.DiscardServer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.handler.codec.http.*;

import java.util.List;

public class TestNettyHttp {
    public static void main(String[] args) {
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // (1)
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap(); // (2)
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class) // (3)
                    .childHandler(new HttpAggregatorInitializer())
                    .option(ChannelOption.SO_BACKLOG, 128)          // (5)
                    .childOption(ChannelOption.SO_KEEPALIVE, false); // (6)

            // Bind and start to accept incoming connections.
            ChannelFuture f = b.bind(8080).sync(); // (7)

            // Wait until the server socket is closed.
            // In this example, this does not happen, but you can do that to gracefully
            // shut down your server.
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
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


}
