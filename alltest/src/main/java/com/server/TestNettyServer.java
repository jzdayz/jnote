package com.server;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.oio.OioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.LineBasedFrameDecoder;
import io.netty.util.ReferenceCountUtil;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestNettyServer {
    public static void main(String[] args) throws Exception{
        new Thread(()->{
            try {
                server();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(()->{
            try {
                Thread.sleep(1000);
                client();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        Thread.sleep(10000000);

    }

    private static void client() {
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            Bootstrap b = new Bootstrap(); // (1)
            b.group(workerGroup); // (2)
            b.channel(NioSocketChannel.class); // (3)
            b.option(ChannelOption.SO_KEEPALIVE, true); // (4)
            b.handler(new ChannelInitializer<SocketChannel>() {
                @Override
                public void initChannel(SocketChannel ch) throws Exception {
                    //ch.pipeline().addLast(new LineEncoder());自己添加换行符，不使用LineEncoder
                    ch.pipeline().addLast(new ChannelInboundHandlerAdapter() {
                        //在于server建立连接后，即发送请求报文
                        public void channelActive(ChannelHandlerContext ctx) {

                            ctx.writeAndFlush(Unpooled.wrappedBuffer("heeelo\n".getBytes()));
                            ctx.writeAndFlush(Unpooled.wrappedBuffer("哈哈哈哈".getBytes()));
                            try {
                                TimeUnit.SECONDS.sleep(5);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            ctx.writeAndFlush(Unpooled.wrappedBuffer(System.getProperty("line.separator").getBytes()));
                            ctx.fireChannelReadComplete();
                        }
                    });
                }
            });
            // Start the client.
            ChannelFuture f = b.connect("127.0.0.1",8080).sync(); // (5)
            // Wait until the connection is closed.
            f.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            workerGroup.shutdownGracefully();
        }
    }


    private static void server() throws InterruptedException {
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        EventLoopGroup master = new NioEventLoopGroup();
        EventLoopGroup salve = new NioEventLoopGroup();

        List<ByteBuf> a = new ArrayList<>();
        serverBootstrap.group(master,salve).channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInitializer<Channel>() {
                    @Override
                    protected void initChannel(Channel ch) throws Exception {
                        ch.pipeline()
                                .addLast(new ChannelInboundHandlerAdapter(){
                                    @Override
                                    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
//                                        final ByteBuf msg1 = (ByteBuf) msg;
//                                        System.err.println(new String(ByteBufUtil.getBytes(msg1)));
                                        a.add((ByteBuf) msg);

                                        ctx.fireChannelRead(msg);
                                    }

                                    @Override
                                    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
                                        final ByteBuf byteBuf = a.get(0);
                                        for (int i = 1; i < a.size(); i++) {
                                            System.out.println(byteBuf == a.get(i));
                                        }
                                    }
                                })
                                .addLast(new LineBasedFrameDecoder(Integer.MAX_VALUE))
                                .addLast(new SimpleChannelInboundHandler<ByteBuf>() {
                                    @Override
                                    protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
                                        System.out.println(new String(ByteBufUtil.getBytes(msg)));
                                    }

                                    @Override
                                    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
                                        cause.printStackTrace();
                                    }
                                })
//                                .addLast(new SimpleChannelInboundHandler<ByteBuf>() {
//                            @Override
//                            protected void channelRead0(ChannelHandlerContext ctx, ByteBuf msg) throws Exception {
//                                System.err.println(new String(ByteBufUtil.getBytes(msg)));
//                            }
//                        })
                    ;
                    }
                })
                .bind(8080)
                .sync()
                .channel()
                .closeFuture()
                .sync();
    }
}
