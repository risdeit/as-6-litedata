package org.albanianskills.db.utils;

/**
 * Custom exception to be thrown if an invalid operation is entered
 */
public class InvalidOperationException extends RuntimeException {

    public InvalidOperationException() {
        super("Invalid operation");
    }
}
