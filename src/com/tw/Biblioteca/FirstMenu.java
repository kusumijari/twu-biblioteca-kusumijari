//contains a menu list that can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class FirstMenu implements Menu {
    ArrayList<String> firstMenu = new ArrayList<String>();
    FirstMenu() {
        firstMenu.add("List Books");
        firstMenu.add("List Movies");
        firstMenu.add("Checkout Movie");
        firstMenu.add("Login");
        firstMenu.add("Exit");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FirstMenu\n");
        for(String menuItem : firstMenu){
            stringBuilder.append(menuItem+"\n");
        }
        return stringBuilder.toString();
    }
}
