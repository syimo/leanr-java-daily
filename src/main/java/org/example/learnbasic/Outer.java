package org.example.learnbasic;


/**
 * 内部类持有外部类的引用
 * <p>
 * 内部类非私有的情况，可以在外部被访问：new Outer().new inner()
 * <p>
 * 内部类变静态class ，就无法持有外部类引用
 * <p>
 * <p>
 * 啥时候使用内部类？
 * <p>
 * 内部事物包括内部类的时候，采用内部类（body --> hear---）
 *
 *
 * 重要，在方法当中，内部类只能访问final修饰的变量
 */
public class Outer {

    int x = 1;


    void method() {

        int ddddadas = 1;

        class Hello {

            void hh() {


                System.out.println("Dadadasda " + ddddadas);
            }

        }

        new Hello().hh();

    }

    static class Inner {
        int x = 6;

        static void fun() {
            int x = 8;
            System.out.println(" hhel x ===" + x);
        }

    }

    static class Hello {
        void go1() {

        }
    }


    static void go() {

        new Hello().go1();

    }


}
