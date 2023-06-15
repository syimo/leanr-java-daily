package org.example.learnbasic;

import java.util.Calendar;

/**
 * java 多态的概念:事物多种形态的体现
 * <p>
 * 多态的优势：提高代码复用性
 * 多态的前提：必须存在覆盖方法
 * 多态的弊端：只能使用夫类的方法
 *
 * <p>
 * 动物 x =new 猫(
 *
 * 接口型应用，多态实现，也是多态的表现形式
 *
 * 多态：接口，抽象类
 *
 */
public class JavaDuotai {
    public static void main(String[] args) {

        //父类的引用指向子类对象
        Animal dog = new Dog();

        //这里类型提升，向上转型
        Animal cat = new Cat();
        ((Cat) cat).catchMouse();

        sys(dog);
        sys(cat);


    }

    public static void sys(Dog dog) {
        dog.eat();
    }

    public static void sys(Cat cat) {
        cat.eat();
    }

    public static void sys(Animal animal) {
        animal.eat();
    }


    static abstract class Animal {
        public abstract void eat();

    }

    static class Dog extends Animal {

        @Override
        public void eat() {
            System.out.println("吃骨头");
        }
    }

    static class Cat extends Animal {

        Cat(){
            super();
        }


        @Override
        public void eat() {
            System.out.println("吃鱼头");

        }

        public void catchMouse() {

        }
    }
}


//interface PCI
//MainBoard
//Net, Sound,WIFI implemnts PCI
//do(PCI pci) //多态的实现。





