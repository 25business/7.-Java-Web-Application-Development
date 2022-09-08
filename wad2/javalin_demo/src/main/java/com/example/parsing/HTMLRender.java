package com.example.parsing;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.io.StringWriter;

public class HTMLRender {

    private static String process(Template template, Object dataModel) throws TemplateException, IOException {
        StringWriter writer = new StringWriter();
        template.process(dataModel, writer);
        return writer.toString();
    }

    public static String render(String template_name) throws IOException, TemplateException {
        Configuration cfg = FreemarkerConfiguration.get();
        Template temp = cfg.getTemplate(template_name);
        return process(temp, new Object());
    }

    public static String render(String template_name, Object dataModel) throws IOException, TemplateException {
        Configuration cfg = FreemarkerConfiguration.get();
        Template temp = cfg.getTemplate(template_name);
        return process(temp, dataModel);
    }
}
