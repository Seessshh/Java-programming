package com.sushil.exam_25_01;

public class InsufficientSeatsException extends RuntimeException
{
    String message;

    public InsufficientSeatsException(String message)
    {
        super(message);
    }
}
