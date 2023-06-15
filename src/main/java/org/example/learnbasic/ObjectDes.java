package org.example.learnbasic;


public class ObjectDes {

    //所有类继承自object

    static class innerDemo {

        public void getFOod() {

        }

    }

    public static Demo function() {
        return new Demo();
    }


    public static void main(String[] args) {

        Day1 e = new Day1();

        Object a = new Object() {
            public void haha() {
                System.out.println("hello x");
            }
        };


//        Class c = d.getClass();
//
//        System.out.println(d.toString());
//        System.out.println(Integer.toHexString(d.hashCode()));
//        System.out.println(d.getClass().getName());


        Outer.Inner ccc = new Outer.Inner();
//        ccc.fun();
        Outer.Inner.fun();

        new Outer().method();


        //父类引用指向子类具体实现对象
        //匿名内部类一般内部方法不会超过3个
        HelloInterface aa = new HelloInterface() {

            @Override
            public void hellp() {

            }

            public void hhhh() {

            }
        };

        aa.hellp();


    }


    public static class Demo {

    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
