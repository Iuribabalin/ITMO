package com.company;

class ControlInput {
    String sanitize(String Input){
        Input = Input.toLowerCase();
        Input = Input.trim();
        return Input;
    }
}
