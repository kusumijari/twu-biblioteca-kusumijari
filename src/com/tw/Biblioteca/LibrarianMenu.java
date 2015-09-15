//Displays the menu for the librarian
package com.tw.biblioteca;

import java.util.ArrayList;

public class LibrarianMenu {

    ArrayList<String> librarianMenu = new ArrayList<String>();
    LibrarianMenu() {
        librarianMenu.add("List Books");
        librarianMenu.add("List Movies");
        librarianMenu.add("Checkout Movie");
        librarianMenu.add("Checkout Book");
        librarianMenu.add("Checkin Book");
        librarianMenu.add("Book Details");
        librarianMenu.add("Exit");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Librarian Menu\n");
        for(String menuItem : librarianMenu){
            stringBuilder.append(menuItem+"\n");
        }
        return stringBuilder.toString();
    }
}
