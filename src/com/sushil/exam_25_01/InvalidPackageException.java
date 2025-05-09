package com.sushil.exam_25_01;

public class InvalidPackageException extends RuntimeException
{
     String message;

    public InvalidPackageException()
    {

    }

    public InvalidPackageException(String message)
    {
        super(message);
    }
}
