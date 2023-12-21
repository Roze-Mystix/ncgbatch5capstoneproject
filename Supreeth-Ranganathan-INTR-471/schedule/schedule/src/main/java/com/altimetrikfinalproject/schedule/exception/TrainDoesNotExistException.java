package com.altimetrikfinalproject.schedule.exception;

public class TrainDoesNotExistException extends Exception{
    String msg;

    public TrainDoesNotExistException(String msg, String message) {
        super(message);
        this.msg = msg;
    }
}
