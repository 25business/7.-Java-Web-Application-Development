package com.example.handlers;

import com.example.models.Person;
import com.example.parsing.HTMLRender;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.util.HashMap;

public class IndexHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        HashMap<String, Object> dataModel = new HashMap<>();
        dataModel.put("title", "Title from Data Model");
        dataModel.put("person", new Person("John", "Smith", 27));
        dataModel.put("names", new String[]{
                "Ann", "Mark", "Josh", "Elizabeth", "Joanna", "Vlad"
        });
        context.html(HTMLRender.render("homepage.ftl", dataModel));
    }
}
