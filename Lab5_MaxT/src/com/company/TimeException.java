package com.company;

public class TimeException extends Exception{
    public TimeException() {
    }
    public TimeException(String message) {

    }

    public TimeException(String message, Throwable cause) {

        System.err.println("(my exception)Incorrect data, try again\n");
    }

    public TimeException(Throwable cause) {
        super(cause);
    }

    public TimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
