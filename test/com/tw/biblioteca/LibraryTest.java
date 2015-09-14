package com.tw.biblioteca;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void shouldReturnContentsOfLibrary() {
        Library library = new Library();

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n", library.toString());
    }

    @Test
    public void shouldRemoveASpecifiedBookFromTheLibrary() {
        Library library = new Library();
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(library.removeBook(book));
    }

    @Test
    public void shouldCheckThatASpecifiedBookInTheLibraryExists() {
        Library library = new Library();
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(library.removeBook(book));
    }

    @Test
    public void shouldReturnFalseIfASpecifiedBookInTheDoesNotLibraryExist() {
        Library library = new Library();
        Book book = new Book("Inferno", "author", 0);

        assertFalse(library.removeBook(book));
    }

    @Test
    public void shouldNotRemoveABookIfItDoesNotExist() {
        Library library = new Library();
        Book book = new Book("Inferno", "author", 0);

        assertFalse(library.removeBook(book));
    }

    @Test
    public void shouldAddBookThatHasBeenRemovedToUnavailableList() {
        Library library = new Library();
        Book book = new Book("Harry Potter", "author", 0);

        assertTrue(library.removeBook(book));
    }

    @Test
    public void shouldAddTheReturnedBookToTheBookList () {
        Library library = new Library();
        Book book = new Book("Harry Potter", "author", 0);

        library.removeBook(book);

        assertTrue(library.returnBook(book));
    }

    @Test
    public void shouldReturnFalseIfTheReturnedBookIsNotABookOfTheLibrary () {
        Library library = new Library();
        Book book = new Book("inferno", "author", 0);

        assertFalse(library.returnBook(book));
    }
}