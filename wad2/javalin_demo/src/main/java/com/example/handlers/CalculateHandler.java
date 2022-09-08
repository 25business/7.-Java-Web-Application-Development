package com.example.handlers;

import io.javalin.http.Context;
import io.javalin.http.Handler;

public class CalculateHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        String x = context.pathParam("x");
        String y = context.pathParam("y");
        String operation = context.pathParam("operation");
        double num_x = Double.parseDouble(x);
        double num_y = Double.parseDouble(y);

        switch (operation) {
            case "plus" -> context.html(String.format("%f + %f = %f", num_x, num_y, (num_x + num_y)));
            case "minus" -> context.html(String.format("%f - %f = %f", num_x, num_y, (num_x - num_y)));
            case "multiply" -> context.html(String.format("%f * %f = %f", num_x, num_y, (num_x * num_y)));
            case "divide" -> context.html(String.format("%f / %f = %f", num_x, num_y, (num_x / num_y)));
            default -> context.html("Invalid operation!");
        }
    }
}
