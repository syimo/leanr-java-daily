package org.example.learnbasic;


/**
 * 匿名内部类对象
 */
public class NimingClas {

    public static void main(String[] args) {

        NimingClas nimingClas = new NimingClas();
        nimingClas.testFun();

    }


    public void testFun() {


        /**
         * 这种就叫做匿名内部类
         */
        new AbsDemo() {
            @Override
            void show() {
                System.out.println("hello ni ming class");
            }

            @Override
            void hhah() {

            }
        }.show();



        //匿名内部类
        new TestInner() {

            @Override
            void go() {

            }
        }.go();

    }


    abstract class AbsDemo {
        abstract void show();

        abstract void hhah();
    }


}
