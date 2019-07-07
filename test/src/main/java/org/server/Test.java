package org.server;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;

import javax.ws.rs.ProcessingException;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-17
 */
public class Test {
    @org.junit.Test
    public void test(){
        HttpServerCodec httpServerCodec = new HttpServerCodec();
        System.out.println(httpServerCodec.isSharable());
    }

    @org.junit.Test
    public void test1(){
        final EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        final EventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.option(ChannelOption.SO_BACKLOG, 1024);
            b.group(bossGroup, workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<Channel>() {
                        @Override
                        protected void initChannel(Channel ch) throws Exception {
                            ch.pipeline().addLast(new HttpServerCodec());
                        }
                    });
            int port = 9999;
            Channel ch = b.bind(port).sync().channel();
            ch.closeFuture().sync();
        } catch (InterruptedException var10) {
            throw new ProcessingException(var10);
        }
    }
}
