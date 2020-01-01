package com.company.Comands;

import com.company.App;
import com.company.Console;

public class AddElementCollection {
    private Console console = new Console();

    public void addElement(App app, String NameElement){
        app.Info.addLast(NameElement);
        toString(NameElement);
    }

    private void toString(String element){
        console.printPrompt(element + " Добавлен успешно");
    }

}
