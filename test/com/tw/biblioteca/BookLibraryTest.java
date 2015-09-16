package com.tw.biblioteca;

import org.junit.Test;

import java.util.HashMap;

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
        User user = new User("Customer", "123-4567", "password");
        Session session = new Session(user);

        assertTrue(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldCheckThatASpecifiedBookInTheLibraryExists() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        User user = new User("Customer", "123-4567", "password");
        Session session = new Session(user);

        assertTrue(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldReturnFalseIfASpecifiedBookInTheDoesNotLibraryExist() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Inferno", "author", 0);
        User user = new User("Customer", "123-4567", "password");
        Session session = new Session(user);

        assertFalse(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldNotRemoveABookIfItDoesNotExist() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Inferno", "author", 0);
        User user = new User("Customer", "123-4567", "password");
        Session session = new Session(user);

        assertFalse(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldAddBookThatHasBeenRemovedToUnavailableList() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        User user = new User("Customer", "123-4567", "password");
        Session session = new Session(user);

        assertTrue(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldAddTheReturnedBookToTheBookList() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        User user = new User("Customer", "123-4567", "password");
        Session session = new Session(user);

        bookLibrary.removeBook(book, session);

        assertTrue(bookLibrary.returnBook(book));
    }

    @Test
    public void shouldReturnFalseIfTheReturnedBookIsNotABookOfTheLibrary() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("inferno", "author", 0);

        assertFalse(bookLibrary.returnBook(book));
    }

    @Test
    public void shouldAddBookAndUserToHashmap(){
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        Session session = new Session(new User("Customer", "123-4567", "password"));
        HashMap<Book, User> hashMap = new HashMap<Book, User>();
        hashMap.put(book, session.getUser());

        assertEquals(hashMap, bookLibrary.addToHashmap(book, session));
    }

    @Test
    public void shouldRemoveEntryFromBooksDetailsOnCheckinOfBook() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        Session session = new Session(new User("Customer", "123-4567", "password"));
        HashMap<Book, User> hashMap = new HashMap<Book, User>();

        bookLibrary.removeBook(book, session);

        assertEquals(hashMap, bookLibrary.removeBookAndUserFromHashmap(book));
    }

    @Test
    public void shouldReturnBookOnlyIfItsTheUserWhoCheckedItOut() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        Session session = new Session(new User("Customer", "123-4567", "password"));

        bookLibrary.removeBook(book, session);

        assertTrue(bookLibrary.isCorrectUser(book, session));
    }

    @Test
    public void shouldReturnFalseIfITheUserWhoCheckedoutTheBookIsNotTheOneWhoReturnsTheBook() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        Session session1 = new Session(new User("Customer", "123-4567", "password1"));
        Session session2 = new Session(new User("Customer", "222-2222", "password2"));

        bookLibrary.removeBook(book, session1);

        assertFalse(bookLibrary.isCorrectUser(book, session2));
    }

    @Test
    public void shouldReturnBookIfItIsReturnedByTheCorrectUser() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", "author", 0);
        Session session1 = new Session(new User("Customer", "123-4567", "password1"));
        bookLibrary.removeBook(book, session1);

        assertTrue(bookLibrary.returnBook(book));
    }
}