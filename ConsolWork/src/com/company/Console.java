package com.company;

public class Console {

    public void printPrompt(String param){
        if(param.equals("")) {
            System.out.print(">>");
        }else{
            System.out.println(param);
        }
    }

}
