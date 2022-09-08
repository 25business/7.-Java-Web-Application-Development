package com.example.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class AboutHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        context.html("<h1>About Handler</h1>");
    }
}
