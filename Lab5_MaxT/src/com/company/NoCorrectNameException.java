package com.company;

public class NoCorrectNameException extends Exception{
    public NoCorrectNameException() {
        System.err.println("(my exception)Exception name : there are no such cities in the list.");
    }

    public NoCorrectNameException(String message) {
        super(message);
    }

    public NoCorrectNameException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoCorrectNameException(Throwable cause) {
        super(cause);
    }

    public NoCorrectNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
