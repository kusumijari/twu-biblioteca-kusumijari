//contains a menu list that can be displayed and calls the appropritate function based on the user input

package com.tw.biblioteca;

import java.util.ArrayList;

public class Menu {
    ArrayList<String> menu= new ArrayList<String>();

    Menu() {
        menu.add("1. List Books");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Menu\n");
        for(String menuItem : menu){
            stringBuilder.append(menuItem+"\n");
        }
        return stringBuilder.toString();
    }
}
