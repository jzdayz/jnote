package org.asm;

import java.util.List;

public class TestParameterNames {
    public static void main(String[] args) throws Exception{
        List<String> main = ParameterNames.getParameterNames(TestParameterNames.class.getDeclaredMethod("main", String[].class));
        System.out.println(main);
    }
}
