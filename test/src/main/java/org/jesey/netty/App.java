package org.jesey.netty;

import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.netty.channel.Channel;
import org.glassfish.jersey.netty.httpserver.NettyHttpContainerProvider;
import org.glassfish.jersey.server.ResourceConfig;

/**
 * Hello world!
 */
public class App {

    static final String ROOT_PATH = "hello";

    private static final URI BASE_URI = URI.create("http://localhost:8080/");

    public static void main(String[] args) {
        try {
            System.out.println("\"Hello World\" Jersey Example App on Netty container.");

            ResourceConfig resourceConfig = new ResourceConfig(HelloWorldResource.class);
            final Channel server = NettyHttpContainerProvider.createServer(BASE_URI, resourceConfig, false);

            Runtime.getRuntime().addShutdownHook(new Thread(server::close));

            System.out.println(String.format("Application started. (HTTP/2 enabled!)\nTry out %s%s\nStop the application using "
                                                     + "CTRL+C.", BASE_URI, ROOT_PATH));
            Thread.currentThread().join();
        } catch (InterruptedException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}