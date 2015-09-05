//Contains a list of books which can be displayed

package com.tw.biblioteca;

import java.util.ArrayList;

public class BookList implements MenuItem{

    ArrayList<Book> booklist= new ArrayList<Book>();

    BookList(ArrayList<Book> booklist) {
        this.booklist = booklist;
    }


    @Override
    public void execute() {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name\tAuthor\tYear\n");

        for(Book book : booklist) {
            stringBuilder.append(book.toString()+"\n");
        }

        System.out.print(stringBuilder.toString());
    }
}
