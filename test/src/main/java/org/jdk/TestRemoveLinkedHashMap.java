package org.jdk;

import org.junit.Test;

import java.util.*;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-17
 */
public class TestRemoveLinkedHashMap {
    @Test
    public void test1(){
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("aa","bb");
        linkedHashMap.put("cc","bb");
        linkedHashMap.put("dd","bb");
        Iterator iterator = linkedHashMap.entrySet().iterator();
        for (;iterator.hasNext();){
            Map.Entry next = (Map.Entry)iterator.next();
            if (Objects.equals(next.getKey(),"cc")){
                iterator.remove();
            }
        }
        System.out.println(linkedHashMap);


    }
}
