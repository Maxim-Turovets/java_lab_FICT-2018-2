package com.company;

public class TimeException extends Exception{
    public TimeException() {
        System.err.println("zzz");
    }

    public TimeException(String message) {
        System.err.println("incorrect data, try again");
    }

    public TimeException(String message, Throwable cause) {

        System.err.println("Incorrect data, try again\n"+"Exception name : "+ cause.toString());
    }

    public TimeException(Throwable cause) {
        super(cause);
    }

    public TimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
