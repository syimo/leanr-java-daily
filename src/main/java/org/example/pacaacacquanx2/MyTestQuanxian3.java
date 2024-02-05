package org.example.pacaacacquanx2;

import org.example.packagequanxain.QX2;
import org.example.packagequanxain.QXChild;

public class MyTestQuanxian3 {

    public static void main(String[] args) {

        //不同包中，只能public
        QX2 qx2 = new QX2();
        qx2.hahaPub();


        QXChild qxChild=new QXChild();
        qxChild.hahaPub();
        qxChild.testFUn();
        qxChild.hahaPub();
        qxChild.hahaPub();

        QX3Child qx3Child=new QX3Child();
        qx3Child.hahaPub();
        qx3Child.hahaPro();


        //

        Pig pig=new Pig();


    }
}
