package org.example.learnbasic;

import java.util.Arrays;

public class Day22 {
    //静态代码块，随着类值加载而加载，只加载一次,类不加载到内存当中则不会执行
    //一个类的加载如下图所示
    //https://photos.app.goo.gl/YVfYFyBrQqbTwwzr7
    static {

    }

    {

    }


    /**
     * 堆内存当中的对象默认都有初始值，null
     * 对象引用是在栈内存当中
     * <p>
     * jvm 调用主函数，args的长度0。new String[0]
     *
     * @param a
     */
    public static void main(String[] a) {
        System.out.println("面向对象思想 a=" + a.length);
        System.out.println("面向对象思想 a=" + (0 << 30));
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
