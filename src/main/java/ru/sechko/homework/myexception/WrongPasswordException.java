package ru.sechko.homework.myexception;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException() {}

    public WrongPasswordException(String message) {
        super(message);
    }
}
