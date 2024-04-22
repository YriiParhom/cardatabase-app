package ru.parhom.cardatabaseapp.exception;

public class NoUserException extends RuntimeException{
    public NoUserException(String message) {
        super(message);
    }
}
