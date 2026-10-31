package com.example;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class App {
    public static void main(String[] args) throws Exception {
        HttpServer server = HttpServer.create(
            new InetSocketAddress("0.0.0.0", 8080), 0);

        server.createContext("/", exchange -> {
            String response = "Hello from Java CI/CD on AWS!";
            exchange.sendResponseHeaders(200, response.length());
            exchange.getResponseBody().write(
                response.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            exchange.close();
        });

        server.start();
        System.out.println("Java application started on port 8080");
    }
}
