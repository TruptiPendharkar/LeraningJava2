package com.trupti.projects.exceptions;

public class InvalidInputException extends Throwable {
    public InvalidInputException() {
    }

    /**
     * Overridden Message Constructor to pass message
     * @param message
     */
    public InvalidInputException(String message) {
        super();
    }
}
