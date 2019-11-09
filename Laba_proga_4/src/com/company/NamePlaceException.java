package com.company;

class NamePlaceException extends RuntimeException{

    private String ErrorMessage = null;

    public String getMessage(){return ErrorMessage;}

    NamePlaceException(String message){
        super(message);
        ErrorMessage = message;
    }
}
