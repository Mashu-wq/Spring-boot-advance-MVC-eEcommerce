package com.zeroo8.E_commerce.payload;

public class APIResponse {
    private String message;
    private boolean status;

    // No-argument constructor
    public APIResponse() {
    }

    // Parameterized constructor
    public APIResponse(String message, boolean status) {
        this.message = message;
        this.status = status;
    }

    // Getter for message
    public String getMessage() {
        return message;
    }

    // Setter for message
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter for status
    public boolean isStatus() {
        return status;
    }

    // Setter for status
    public void setStatus(boolean status) {
        this.status = status;
    }

    // toString() method for debugging/logging
    @Override
    public String toString() {
        return "APIResponse{" +
                "message='" + message + '\'' +
                ", status=" + status +
                '}';
    }
}
