//Parses the menu option entered by the user

package com.tw.biblioteca;

import java.util.ArrayList;

public class Parser {
    private String option;

    public Parser(String option) {
        this.option = option;
    }

    public boolean isValid() {
        if(option.matches("[0-9]+") && convertOptionToInt() > 0 && convertOptionToInt() <= 3 ) {
            return true;
        }
        return false;
    }

    private int convertOptionToInt() {
        return Integer.parseInt(option);
    }

    public MenuItem createMenuItem() {
        if(isValid()) {
            if (convertOptionToInt() == 1) {
                ArrayList<Book> list = new ArrayList<Book>();
                Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
                Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
                list.add(book1);
                list.add(book2);
                return new Library(list);
            }
            else if(convertOptionToInt() == 2) {
                return new Exit();
            }
        }
        return new InvalidMenuItem();
    }
}
