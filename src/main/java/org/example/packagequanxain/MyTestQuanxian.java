package org.example.packagequanxain;

import org.example.packagequanxain.ggg.Dog;
import org.example.pacaacacquanx2.QX3;

public class MyTestQuanxian {

    public static void main(String[] args) {

        //同一个包中，类成员当中的private不能访问
        QX2 qx2 = new QX2();
        qx2.hahaPro();
        qx2.hahaPub();
        qx2.hahaDefault();

        //不同包中，类成员当中的protected 和 private,default不能访问,只能访问public
        QX3 qx3 = new QX3();
        qx3.hahaPub();

        QXChild qxChild = new QXChild();
        qxChild.hahaPro();
        qxChild.hahaPub();
        qxChild.hahaDefault();
        
        Dog dog = new Dog();
        dog.hahaProtected();

        //https://www.programiz.com/java-programming/access-modifiers
        //权限图java
        Cat cat = new Cat();
        cat.hahaDefault();
        cat.hahaProtected();

        ///带有pack的编译java文件的时候， javac -d . Demo.java//指定类文件存放目录
        // 执行： java pack.Demo
        //package 让java文件和class文件分隔开来

        Object s=new Object(){

        };
    }
}
