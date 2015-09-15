//Displays the menu options for the user

package com.tw.biblioteca;

import java.util.ArrayList;

public class CustomerMenu implements Menu{
    ArrayList<String> userMenu = new ArrayList<String>();
    CustomerMenu() {
        userMenu.add("List Books");
        userMenu.add("List Movies");
        userMenu.add("Checkout Movie");
        userMenu.add("Checkout Book");
        userMenu.add("Checkin Book");
        userMenu.add("Logout");
        userMenu.add("Exit");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Customer Menu\n");
        for(String menuItem : userMenu){
            stringBuilder.append(menuItem+"\n");
        }
        return stringBuilder.toString();
    }
}
