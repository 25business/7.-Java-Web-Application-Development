package com.example.handlers;

import com.example.data.NamesLogic;
import com.example.parsing.HTMLRender;
import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.util.HashMap;

public class NamesHandler implements Handler {
    @Override
    public void handle(Context context) throws Exception {
        String sort_order = context.queryParam("sort");
        String[] names = NamesLogic.getNames(sort_order);
        HashMap<String, Object> dataModel = new HashMap<>();
        dataModel.put("names", names);
        String html_output = HTMLRender.render("names.ftl", dataModel);
        context.html(html_output);
    }
}