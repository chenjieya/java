package org.orm.com.exception;

public class SqlFormatException extends RuntimeException {


    public SqlFormatException() {}

    public SqlFormatException(String message) {
        super(message);
    }

}
