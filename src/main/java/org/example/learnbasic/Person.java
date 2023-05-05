package org.example.learnbasic;

public class Person {
    private int age;
    private boolean hasSon;
    private String name;

    /**
     * 存在于方法区里面
     *
     */
    private static String SSSS = "sasasasas";


    Person() {
        System.out.println("init person age =" + age + "----name=" + name + "--hasSon=" + hasSon);
    }

    /**
     * 构造代码块优先于构造函数
     */ {
        System.out.println("blank");
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }


    /***
     * this 必须在行首
     * @param name
     */
    public Person(String name) {
//        this.age=10;
//        this(10,name);
    }

    static {
        System.out.println("static person");
    }
}
