//contains a menu list that can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class DefaultMenu implements Menu {
    ArrayList<String> firstMenu = new ArrayList<String>();
    DefaultMenu() {
        firstMenu.add("List Books");
        firstMenu.add("List Movies");
        firstMenu.add("Checkout Movie");
        firstMenu.add("Login");
        firstMenu.add("Exit");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultMenu\n");
        for(String menuItem : firstMenu){
            stringBuilder.append(menuItem+"\n");
        }
        return stringBuilder.toString();
    }
}
