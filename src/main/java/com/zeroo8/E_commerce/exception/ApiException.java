package com.zeroo8.E_commerce.exception;
// ApiException class is created to handle exceptions in the API
public class ApiException extends RuntimeException{
    private static final long serialVersionUIO = 1L;

    public ApiException() {
    }

    public ApiException(String message) {
        super(message);
    }
}
