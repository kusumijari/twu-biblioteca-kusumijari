//Parses the menu option entered by the user

package com.tw.biblioteca;

import java.util.ArrayList;

public class Parser {
    private String option;

    public Parser(String option) {
        this.option = option;
    }

    public boolean isValid() {
        if(option.matches("[0-9]+") && convertToInt() < 0 && convertToInt() == 1 ) {
            return true;
        }
        return false;
    }

    private int convertToInt() {
        return Integer.parseInt(option);
    }

    public MenuItem createMenuItem() {
        if(isValid()) {
            if (convertToInt() == 1) {
                ArrayList<Book> list = new ArrayList<>();
                Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
                Book book2 = new Book("Tale of Two Cities", "Charles Dickens", 1859);
                list.add(book1);
                list.add(book2);
                return new BookList(list);
            }
        }
        return new InvalidMenuItem();
    }
}
