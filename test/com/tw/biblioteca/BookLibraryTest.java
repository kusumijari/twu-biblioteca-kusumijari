package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BookLibraryTest {

    @Test
    public void shouldReturnContentsOfLibrary() {
        BookLibrary bookLibrary = new BookLibrary();

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n", bookLibrary.toString());
    }

    @Test
    public void shouldRemoveASpecifiedBookFromTheLibrary() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(bookLibrary.removeBook(book));
    }

    @Test
    public void shouldCheckThatASpecifiedBookInTheLibraryExists() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(bookLibrary.removeBook(book));
    }

    @Test
    public void shouldReturnFalseIfASpecifiedBookInTheDoesNotLibraryExist() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Inferno", "author", 0);

        assertFalse(bookLibrary.removeBook(book));
    }

    @Test
    public void shouldNotRemoveABookIfItDoesNotExist() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Inferno", "author", 0);

        assertFalse(bookLibrary.removeBook(book));
    }

    @Test
    public void shouldAddBookThatHasBeenRemovedToUnavailableList() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(bookLibrary.removeBook(book));
    }

    @Test
    public void shouldAddTheReturnedBookToTheBookList () {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);

        bookLibrary.removeBook(book);

        assertTrue(bookLibrary.returnBook(book));
    }

    @Test
    public void shouldReturnFalseIfTheReturnedBookIsNotABookOfTheLibrary () {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("inferno", "author", 0);

        assertFalse(bookLibrary.returnBook(book));
    }
}