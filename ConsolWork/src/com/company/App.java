package com.company;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class App {
    private Console console = new Console();
    private Dispatcher dispatcher = new Dispatcher(this);
    private Scanner scan = new Scanner(System.in);

    private boolean flagWork = true;

    void StartWork(){
        UpdateCollection();
        while(flagWork){
           console.printPrompt("");
           String value = scan.nextLine();
           dispatcher.Dispatch(value);
        }
    }

    public void StopWork(){
        flagWork = false;
    }

    public Deque<String> Info = new ArrayDeque<>();

    void UpdateCollection() {
        Info.add("Hello");
        Info.add("world!");
        Info.add("I");
        Info.add("like");
    }
}
