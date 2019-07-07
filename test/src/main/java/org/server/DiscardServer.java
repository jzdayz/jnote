package org.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.ReplayingDecoder;

import java.util.List;

public class DiscardServer {
    
    private int port;
    
    public DiscardServer(int port) {
        this.port = port;
    }
    
    public void run() throws Exception {
        EventLoopGroup bossGroup = new NioEventLoopGroup(); // (1)
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap b = new ServerBootstrap(); // (2)
            b.group(bossGroup, workerGroup)
             .channel(NioServerSocketChannel.class) // (3)
             .childHandler(new ChannelInitializer<SocketChannel>() { // (4)
                 @Override
                 public void initChannel(SocketChannel ch) throws Exception {
                     ch.pipeline()
                             .addLast(new DiscardServerHandler())
                     .addLast(new ToIntegerDecoder());
                 }
             })
             .option(ChannelOption.SO_BACKLOG, 128)          // (5)
             .childOption(ChannelOption.SO_KEEPALIVE, true); // (6)

            // Bind and start to accept incoming connections.
            ChannelFuture f = b.bind(port).sync(); // (7)
    
            // Wait until the server socket is closed.
            // In this example, this does not happen, but you can do that to gracefully
            // shut down your server.
            f.channel().closeFuture().sync();
        } finally {
            workerGroup.shutdownGracefully();
            bossGroup.shutdownGracefully();
        }
    }
    
    public static void main(String[] args) throws Exception {
        int port = 8080;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }

        new DiscardServer(port).run();
    }

    public class DiscardServerHandler extends ChannelInboundHandlerAdapter { // (1)


        @Override
        public void channelActive(ChannelHandlerContext ctx) throws Exception {
            final ByteBuf byteBuf = Unpooled.copiedBuffer("NETTY SERVER IS ACTIVE!!".getBytes());
            ctx.writeAndFlush(byteBuf);
        }

        @Override
        public void channelRead(ChannelHandlerContext ctx, Object msg) { // (2)
            // Discard the received data silently.
//            ((ByteBuf) msg).release(); // (3)
            ctx.write(msg); // (1)
//            ctx.flush(); // (2)
            ctx.fireChannelRead(msg);
        }

        @Override
        public void channelInactive(ChannelHandlerContext ctx) throws Exception {
            System.out.println("\nCONNECTION CLOSE\n");
            super.channelInactive(ctx);
        }

        @Override
        public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) { // (4)
            // Close the connection when an exception is raised.
            cause.printStackTrace();
            ctx.close();
        }
    }

    public class ToIntegerDecoder2 extends ReplayingDecoder<Void> {   //1

        @Override
        public void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out)
                throws Exception {
            final int e = in.readInt();
            System.out.println(e);
            out.add(e);  //2
        }
    }

    public class ToIntegerDecoder extends ByteToMessageDecoder {  //1

        @Override
        public void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out)
                throws Exception {
            final int e = in.readInt();
            System.out.println(e);
            out.add(e);  //3
        }
    }

}