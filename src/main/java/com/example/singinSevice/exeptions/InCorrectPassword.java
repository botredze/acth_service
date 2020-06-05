package com.example.singinSevice.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.UNAUTHORIZED)
public class InCorrectPassword extends RuntimeException {
    public InCorrectPassword(String message) {
        super(message);
    }
}
