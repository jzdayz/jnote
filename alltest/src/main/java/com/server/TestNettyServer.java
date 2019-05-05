package com.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public class TestNettyServer {
    public static void main(String[] args) throws Exception{


        new Thread(()->{
            try {
                Thread.sleep(5000);
                System.err.println("------");
                Socket socket = new Socket("localhost",10001);


                socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        ServerBootstrap serverBootstrap = new ServerBootstrap();
        EventLoopGroup master = new NioEventLoopGroup();
        EventLoopGroup salve = new NioEventLoopGroup();
        serverBootstrap.group(master,salve).channel(NioServerSocketChannel.class)
                .childHandler(new ChannelInboundHandlerAdapter(){
                    @Override
                    public void channelActive(ChannelHandlerContext ctx) throws Exception {
                        super.channelActive(ctx);
                        System.out.println(ctx.channel().remoteAddress()+"  "+ctx.channel().remoteAddress());
                    }
                })
                .bind(10001)
                .sync()
                .channel()
                .closeFuture()
                .sync();





    }
}
