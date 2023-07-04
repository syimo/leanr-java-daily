package org.example.learnbasic;

public class TestFather {

    public static void main(String[] args) {
//        new MyDemo();
        testEX();
//        new Inner().
    }

    class Inner {
    }

    public static void testEX() {
        try {
            throw new Exception("errer");
//            System.out.println("11111");
        } catch (Exception w) {

            if (1<=0){
                System.out.println("dadadasdas" + w.getMessage());
            }

            return;
        } finally {
            System.out.println("22222222");
        }

//        System.out.println("last");
    }


    static class Demo {
        Demo() {
            super();
            System.out.println("helloe demo");
        }

        void haha() {

        }

    }


    static class MyDemo extends Demo {
        MyDemo() {
            System.out.println("haha mydemo");

        }

        protected void haha() {

        }
    }
}
