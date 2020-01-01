package com.company.Comands;

import com.company.App;
import com.company.Console;

public class ShowCollection {
    private Console console = new Console();

    public void Show(App app){
        for(String element: app.Info){
            console.printPrompt(element);
        }
    }

}
