package org.example.thred;

public class Ticket implements Runnable {

    private int ticket = 100;

    private final Object object = new Object();


    @Override
    public void run() {


        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (object) {
                if (ticket > 0) {
                    System.out.println("name= " + Thread.currentThread().getName() + "-use ticket=" + (ticket--));
                } else {
                    break;
                }
            }

        }

    }
}
