package org.jesey;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.IOException;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author ${projectAuthor}
 */
@Path("/test")
public class GrizzlyHttpServer {

    private static final URI BASE_URI = URI.create("http://localhost:8080/base/");

    public static final String ROOT_PATH = "resource-path";

    public static void main(String[] args) {
        try {
            System.out.println("jersey-example-java8-webapp");

            final HttpServer server = GrizzlyHttpServerFactory.createHttpServer(BASE_URI, new ResourceConfig(GrizzlyHttpServer.class), false);
            Runtime.getRuntime().addShutdownHook(new Thread(server::shutdownNow));
            server.start();

            System.out.println(String.format(
                    "Application started.${symbol_escape}n"
                            + "Try out %s%s${symbol_escape}n"
                            + "Stop the application using CTRL+C",
                    BASE_URI, ROOT_PATH));

            Thread.currentThread().join();
        } catch (IOException | InterruptedException ex) {
            Logger.getLogger(GrizzlyHttpServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayPlainTextHello() {
        return "Hello Jersey Plain";
    }
    // This method is called if XML is requested
    @GET
    @Produces(MediaType.TEXT_XML)
    public String sayXMLHello() {
        return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
    }

    // This method is called if HTML is requested
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";
    }


}
