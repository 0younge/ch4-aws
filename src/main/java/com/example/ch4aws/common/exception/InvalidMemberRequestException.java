package com.example.ch4aws.common.exception;

public class InvalidMemberRequestException extends RuntimeException {

    public InvalidMemberRequestException(String message) {
        super(message);
    }
}
