//Exits the application

package com.tw.biblioteca;

public class Exit implements MenuItem{

    @Override
    public String execute() {
        System.exit(0);
        return "exit";
    }
}
