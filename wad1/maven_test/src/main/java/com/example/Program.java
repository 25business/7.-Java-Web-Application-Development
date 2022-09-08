package com.example;

import org.apache.commons.io.IOUtils;

import java.io.InputStream;
import java.net.URL;

public class Program {
    public static void main(String[] args) {
        try {
            InputStream in = new URL("https://commons.apache.org").openStream();
            System.out.println(IOUtils.toString(in));
            IOUtils.closeQuietly(in);
        }catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
