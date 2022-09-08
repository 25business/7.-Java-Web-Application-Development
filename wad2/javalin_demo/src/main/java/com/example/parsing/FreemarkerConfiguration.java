package com.example.parsing;

import freemarker.template.Configuration;
import freemarker.template.TemplateExceptionHandler;

import java.io.File;
import java.io.IOException;

public class FreemarkerConfiguration {
    private static Configuration cfg = null;

    public static Configuration get() throws IOException {
        if(cfg != null) return cfg;
        cfg = new Configuration(Configuration.VERSION_2_3_31);
        cfg.setDirectoryForTemplateLoading(new File(System.getenv("JAVA_RESOURCES") + "/wad2/templates"));
        cfg.setDefaultEncoding("UTF-8");
        cfg.setTemplateExceptionHandler(TemplateExceptionHandler.HTML_DEBUG_HANDLER);
        cfg.setFallbackOnNullLoopVariable(true);
        return cfg;
    }
}
