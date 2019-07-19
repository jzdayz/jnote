package org.regex;

import com.github.ofofs.reggen.RegexGenerator;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-07-18
 */
public class Test {
    public static void main(String[] args) {
        String regex = "\\?|\\*|\\{((?:\\{[^/]+?\\}|[^/{}]|\\\\[{}])+?)\\}";
        System.out.println("X:" + RegexGenerator.generate(regex));
    }
}
