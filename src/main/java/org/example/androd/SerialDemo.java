package org.example.androd;

import java.io.*;

public class SerialDemo {

    public static void main(String[] aargs) {
        USer uSer = new USer();
        uSer.name = "jack";
        uSer.userID = 123;

        new Object() {
            public void haha() {

            }
        }.haha();

//        try {
//            //序列化
//            ObjectOutputStream outputStream =new
//                    ObjectOutputStream(new FileOutputStream("cachc.txt"));
//
//            outputStream.writeObject(uSer);
//            outputStream.close();
//
//        } catch (IOException e) {
//        }

        try {
            //反序列化
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("cachc.txt"));
            USer newUSer = (USer) in.readObject();
            in.close();

            System.out.println(" newuser name=" + newUSer.userID + "=====name==" + newUSer.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
