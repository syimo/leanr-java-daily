package org.example.learnbasic;

import java.util.Arrays;

public class Day22 {

    /**
     * 堆内存当中的对象默认都有初始值，null
     * 对象引用是在栈内存当中
     *
     * jvm 调用主函数，args的长度0。new String[0]
     *
     *
     * @param a
     */
    public static void main(String[] a) {
        System.out.println("面向对象思想 a="+a.length);
//
//        Car car = new Car();
//
//        //show的car 在栈内存当中也是一个引用
//        //https://photos.app.goo.gl/px9xjpsNoD54tQyi8
//        show(car);
//        Person p = new Person();
    }


    public static void show(Car car) {

    }

    static class Car {


        public Car() {

        }

        String color = "black";

        public void run() {
            System.out.println("hello color =" + color);
        }
    }
}
