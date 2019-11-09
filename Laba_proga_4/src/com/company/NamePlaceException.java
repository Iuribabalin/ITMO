package com.company;

class NamePlaceException extends Exception {

    private String ErrorMessage = null;

    public String getMessage(){return ErrorMessage;}

    NamePlaceException(String message){
        super(message);
        ErrorMessage = message;
    }
}
