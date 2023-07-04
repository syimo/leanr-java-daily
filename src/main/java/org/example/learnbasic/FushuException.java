package org.example.learnbasic;

public class FushuException extends NullPointerException{
    public FushuException() {
    }

    public FushuException(String message) {
        super(message);
    }
//
//    @Override
//    public String getMessage() {
//        return "FushuException";
//    }
}
