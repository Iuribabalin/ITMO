package com.company.Comands;

import com.company.App;
import com.company.Console;

public class RemoveElementCollection {
    private Console console = new Console();

    public void removeElement(App app, String NameElement){
        app.Info.remove(NameElement);
        toString(NameElement);
    }

    private void toString(String element){
        console.printPrompt(element + " Удалён успешно");
    }

}
