package org.example.learnbasic;

public class Day3 {
    /**
     *
     */
    /**
     * 继承，多态概念
     * <p>
     * 关于构造函数的概念如下：
     * 子类的构造函数默认第一行都是super()
     * <p>
     * https://photos.app.goo.gl/Jq5LpZKmJzkzuVaZ8
     *
     * @param args
     */
    public static void main(String[] args) {

        FU f = new Son(11);

        //子类构造函数默认初始化，夫类构造函数也会执行
        //每个构造函数都包涵super(
    }

    /**
     * 子类的构造函数一定会调用super().因为子类会访问父类的一些数据
     */

    static class FU {
        private int num = 2;
//
//        FU() {
//            System.out.println("fu init");
//        }

        FU(int i) {
            this.num = i;
        }

        final public void show() {

        }
    }

    static class Son extends FU {
        int num2 = 12;


        Son() {
            super(1);
            System.out.println("Son init");
        }

        Son(int nn) {
            this();
//            super(nn);
            this.num2 = nn;
            System.out.println("Son init 2");
            this.show();
        }


        public void hello() {

        }


    }


    /**
     * final关键词
     */
    public void testFinal() {


    }
}
