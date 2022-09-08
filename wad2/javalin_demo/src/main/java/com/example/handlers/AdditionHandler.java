package com.example.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class AdditionHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        String x = context.pathParam("x");
        String y = context.pathParam("y");
        double num_x = Double.parseDouble(x);
        double num_y = Double.parseDouble(y);
        context.html(String.format("%f + %f = %f", num_x, num_y, (num_x+num_y)));
    }
}
