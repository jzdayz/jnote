package com.example.jnote;

/**
 * @author ☞ 🏀 huqingfeng
 * @date 2019-06-05
 */
public class Lock {

    public class Sync extends AQS{

        final Condi newCondi(){
            return new Condi();
        }

    }

    private Sync sync;

    public Lock(){
        sync = new Sync();
    }

    public AQS.Condi newCondi(){
        return sync.newCondi();
    }


    public static void main(String[] args) {
        Lock lock = new Lock();
        AQS.Condi condi = lock.newCondi();
        lock.sync.setInteger(1111);
        System.out.println(condi.get());

    }

}
