package com.jdk;

import java.util.TreeMap;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-13
 */
public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>((x, y) -> {
            if (x > y) {
                return -1;
            }
            if (x == y) return 0;
            return 1;
        });
        treeMap.put(10,"sdfsdfsd");
        treeMap.put(9,"sdfsdfsd");
        treeMap.forEach((x,y)->{
            System.out.println(x+" "+y);
        });
    }
}
