package org.data.sql;

public class A implements AMXBean {

    private Integer a;

    @Override
    public Integer get() {
        return a;
    }

    @Override
    public void set(Integer value) {
        a = value;
    }

    @Override
    public void show() {
        System.out.println(a);
    }


}
