package org.example.learnbasic;

public class Day2 {

    public static void main(String[] aa) {

//        toHex(-60);
//        toBinary2(10);
//        toOctal(-110);

//        decimalConvert(100, 15, 4);
//        decimalConvert(-100, 15, 4);
//
//        decimalConvert(100, 7, 3);
//        decimalConvert(-100, 7, 3);
//
//        decimalConvert(100, 1, 1);
//        decimalConvert(-100, 1, 1);

        twoArray();
    }


    /**
     * 进制转换:10->16进制
     * 1个int型 代表4个字节32位，所以循环8次
     */
    public static void toHex(int num) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int value = num & 15;
            if (value < 10) {
                stringBuilder.append(value);
            } else {
                stringBuilder.append((char) ('A' + (value - 10)));
            }
            num = num >>> 4;
        }
        System.out.println(stringBuilder.reverse());

    }

    /**
     * 10进制->2进制
     */
    public static void toBinary2(int num) {
        char[] charsMap = {'0', '1'};
        char[] value = new char[32];
        int pos = value.length - 1;
        for (int i = 0; i < value.length; i++) {
            value[pos--] = charsMap[num & 1];
            num = num >>> 1;
        }
        System.out.println(value);
    }

    /**
     * 10进制->8进制
     */
    public static void toOctal(int num) {
        decimalConvert(num, 7, 3);
    }


    /**
     * 十进制转任意进制
     *
     * @param num
     * @param base
     * @param offset
     */
    public static void decimalConvert(int num, int base, int offset) {

        char[] charsMap =
                {'0', '1', '2', '3',
                        '4', '5', '6', '7',
                        '8', '9', 'A', 'B',
                        'C', 'D', 'E', 'F'};
        if (num == 0) {
            System.out.println(0);
            return;
        }

        char[] value = new char[32];
        int pos = value.length - 1;

        while (num != 0) {
            value[pos--] = charsMap[num & base];
            num = num >>> offset;
        }

        for (int i = pos + 1; i < value.length; i++) {
            System.out.print(value[i]);
        }
        System.out.println();
    }


    public static void twoArray() {

        char[][] aaray = new char[3][10];

        //长度为3
        System.out.println("length size = " + aaray.length);
        System.out.println("length size = " + aaray);
        System.out.println("length size = " + aaray[0]);


        int[][] tes = new int[3][];
        System.out.println(tes[0]);

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9, 10}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("sum = " + sum);

        int c[] = new int[10];

    }


}
