package com.example.singinSevice.exeptions;

public class AccauntOlReadyExist extends RuntimeException{

    public AccauntOlReadyExist(String message) {
        super(message);
    }
}
