package org.orm.com.exception;

public class ConfigFileNotFoundException extends RuntimeException {

    public ConfigFileNotFoundException() {}

    public ConfigFileNotFoundException(String message) {
        super(message);
    }
}
