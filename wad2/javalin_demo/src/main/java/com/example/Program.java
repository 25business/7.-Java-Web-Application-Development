package com.example;

import com.example.handlers.*;
import io.javalin.Javalin;


public class Program {
    public static void main(String[] args) {
        Javalin server = Javalin.create();

        server.get("/", new IndexHandler());
        server.get("/about", new AboutHandler());
        server.get("/add/{x}/{y}", new AdditionHandler());
        server.get("/calculate/{x}/{operation}/{y}", new CalculateHandler());
        server.get("/names", new NamesHandler());

        server.start(9000);
    }
}
