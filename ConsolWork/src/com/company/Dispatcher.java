package com.company;

import com.company.Comands.*;

import java.util.Map;


class Dispatcher {
    private final App app;

    Dispatcher(App app) {
        this.app = app;
    }

    private Map<String, Command> commands;



    private ComandOffWork comandOffWork = new ComandOffWork();
    private ControlInput control = new ControlInput();
    private ShowCollection show = new ShowCollection();
    private RemoveElementCollection remove = new RemoveElementCollection();
    private AddElementCollection addElement = new AddElementCollection();

    void Dispatch(String value){
        String[] ComandArr = value.split(" ");
        value = ComandArr[0];
        control.sanitize(value);
        switch (value) {
            case "off":
                comandOffWork.Execute(app);
                break;
            case "show":
                show.Show(app);
                break;
            case "remove":
                remove.removeElement(app,ComandArr[1]);
                break;
            case "add":
                addElement.addElement(app,ComandArr[1]);
                break;
        }
    }
}
