package com.company;

class FlyException extends Exception {
    private String ErrorMessage = null;

    public String getMessage(){return ErrorMessage;}

    FlyException(String message){
        super(message);
        ErrorMessage = message;
    }
}
