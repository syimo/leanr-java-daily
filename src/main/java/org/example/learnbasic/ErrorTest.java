package org.example.learnbasic;

public class ErrorTest {

    /**
     * Error: 一般不处理
     * <p>
     * Exception:要处理
     *
     * @param args 继承自runtimeexeception 的异常，不需要在申明throw，编译可通过
     *             非继承RuntimeExeception的异常，必须申明throws
     *
     *             exception分为：1,编译时异常 2，运行时异常
     *
     * throws 是在方法名上。thorw是在方法内部
     */
    public static void main(String[] args) throws Exception {

        load("error stsart");

        Error error = new Error();
        Exception exception = new Exception();

        Exception a = new IllegalArgumentException();

        load(exception.getMessage());


        byte[] haha = new byte[1029 * 1024 * 1000 * 1000];

        try {
            div(10, 9);
        } catch (Exception e) {
            throw new FushuException();

        }

    }

    public static void div(int a, int b) {

        if (b == 0) {
            throw new FushuException();
        }
        int c = a / b;
    }

    public static void load(String msg) {
        System.out.println(msg);
    }

    public void handle(int a) throws FushuException {
        if (a <= 0) {
            throw new FushuException("Dadasdasdasd");
        }
    }

    public void handle2(int a) throws FushuException {
        if (a <= 0) {
            throw new MyRuntimeExeception("Dadasdasdasd");
        }
    }
}
