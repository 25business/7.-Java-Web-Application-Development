package com.example.data;
import java.util.Arrays;

public class NamesLogic {
    private static  String[] main_names = new String[] {
            "Ann", "Mark", "Josh", "Elizabeth", "Joanna", "Vlad"
    };
    public static String[] getNames(String sort_order) {
        if(sort_order == null) return main_names;
        String[] names = Arrays.copyOf(main_names, main_names.length);

        for(int i = 0; i < names.length-1; i++) {
            for(int j = i +1; j < names.length; j++) {
                if(sort_order.equals("asc")) {
                    if(names[i].compareTo(names[j]) > 0) {
                        String tmp = names[i];
                        names[i] = names[j];
                        names[j] = tmp;
                    }
                } else {
                    if(names[i].compareTo(names[j]) < 0) {
                        String tmp = names[i];
                        names[i] = names[j];
                        names[j] = tmp;
                    }
                }
            }
        }
        return names;
    }
}
