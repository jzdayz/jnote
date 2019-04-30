package com.example.jnote;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestEureka {
    public static void main(String[] args) {
        final Pattern compile = Pattern.compile("\\$\\{(.*?)\\}");
        final Matcher matcher = compile.matcher("${aa}");
        while (matcher.find()){
            final String group = matcher.group(1);
            System.out.println(group);
        }
    }
}
