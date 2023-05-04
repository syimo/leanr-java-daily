package org.example.learnbasic;

import java.util.Arrays;

public class Day1 {
    /**
     * loop相关学习
     *
     * @param args
     */
    public static void main(String[] args) {
//        loopPrint();
//        print99(9);

//        testArray();
//        getMaxAndMin();
        sort();

    }


    /**
     * 打印三角形树,分成-和*两部分来看待
     * ----*
     * ---*  *
     * --*  *  *
     * -*  *  *  *
     * *  *  *  *  *
     */
    public static void loopPrint() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 4) {
                    System.out.print(" ");
                } else if (j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }


    /**
     * 打印99乘法表
     *
     * @param num
     */
    public static void print99(int num) {
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j + 1) + "*" + (i + 1) + "=" + (j + 1) * (i + 1) + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 数组的概念
     * <p>
     * 开始到栈内存和堆内存的概念
     * <p>
     * 栈内存：数据使用完毕会自动释放，局部变量（方法）。
     * <p>
     * 堆内存：new出来的对象都是在堆内存中
     * 堆内存3个特点：1内存地址值 2默认初始值 3垃圾回收机制。当堆内存中的某个数据，没有仍和引用指向它时，系统会自动回收内存。
     * <p>
     * <p>
     * <p>
     * https://photos.app.goo.gl/RWsNNm5H78daXSGJ8
     */
    public static void testArray() {
        //array在栈内存当中，int[100]在堆内存当中，array引用int[100]在堆内存当中的地址。
        //堆内存当中都有默认的值。float就是0.0f,double就是0.0,boolean就是false
        int[] array = new int[100];

        System.out.println(array[0]);
        System.out.println(array[1]);

        //这里a和b都是在栈内存当中，引用的只是值，和对象引用还是有区别的

        int a = 5;
        int b = a;
        b = 90;
        System.out.println("b= " + b);

        //数组定义的另一种形式
        int[] arr = new int[]{1, 2, 3, 4, 5};

        //[I@3f102e87 [表示数组，I表示int类型，@后面的十六进制数据代表内存地址。

        System.out.println("arr= " + arr);

    }


    /**
     * 获取最大值和最小值
     * int[] array ={100,32,4,1,22,66,44,123,66,990,12}
     */
    public static void getMaxAndMin() {
        int[] array = {100, 32, 4, 1, 22, 66, 44, 123, 66, 990, 12};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= max) {
                max = array[i];
            }
        }
        System.out.println("max value =" + max);

    }

    /*
     //对数组排序，最简单的冒泡排序,从小到大
     */
    public static void sort() {

        int[] array = {100, 32, 4, 1, 22, 66, 44, 123, 66, 990, 12};

        //选择排序
        for (int i = 0; i < array.length - 1; i++) {
            int min_value = array[i];
            int min_index = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= min_value) {
                    min_value = array[j];
                    min_index = j;
                }
            }

            array[min_index] = array[i];
            array[i] = min_value;
        }

        System.out.println("arrays1 = " + Arrays.toString(array));

        int[] array2 = {100, 32, 4, 1, 22, 66, 44, 123, 66, 990, 12};

        //冒泡排序
        for (int i = 0; i < array2.length - 1; i++) {

            for (int j = 0; j < array2.length - 1; j++) {

                if (array[j + 1] > array2[j]) {
                    int temp = array2[j + 1];
                    array2[j + 1] = array2[j];
                    array2[j] = temp;
                }
            }
        }
        System.out.println("arrays12 = " + Arrays.toString(array2));
    }


}