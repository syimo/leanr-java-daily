package org.example.thred;

public class TestT extends Thread {


    private static int ticket = 100;

    @Override
    public void run() {

        while (ticket > 0) {
            System.out.println(" ticket left = " + ticket--);
        }
    }
}
