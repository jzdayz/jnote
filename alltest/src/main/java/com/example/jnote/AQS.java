package com.example.jnote;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-05
 */
public class AQS {


    private Integer integer;

    public Integer getInteger() {
        System.out.println(this);
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }



    public class Condi{

        public Integer get(){
            System.out.println(this);
            return getInteger();
        }

    }


}
