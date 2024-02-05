package org.example.thred;

public class ThredDemo {


    /**
     * 多线程推荐使用runnable，因为单继承的局限性
     *
     * @param ar
     */
    public static void main(String[] ar) {

        Ticket ticket =new Ticket();

        Thread a=new Thread(ticket);
        a.setName("Thread-1");

        Thread a2=new Thread(ticket);
        a2.setName("Thread-2");

        Thread a3=new Thread(ticket);
        a3.setName("Thread-3");

        a.start();
        a2.start();
        a3.start();






//        TestT d = new TestT();
//        d.start();
//
//        TestT d2 = new TestT();
//        d2.start();
//
//        Runnable run=new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//
//        new Thread(run).start();

    }
}
