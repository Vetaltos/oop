package ru.sechko.homework.myexception;

public class WrongLoginException extends RuntimeException {

    public WrongLoginException() {}

    public WrongLoginException(String message) {
        super(message);
    }
}
