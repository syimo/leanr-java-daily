package org.example.learnbasic;

public class MyRuntimeExeception extends RuntimeException{
    public MyRuntimeExeception() {
    }

    public MyRuntimeExeception(String message) {
        super(message);
    }

    public MyRuntimeExeception(String message, Throwable cause) {
        super(message, cause);
    }

    public MyRuntimeExeception(Throwable cause) {
        super(cause);
    }

    public MyRuntimeExeception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
