package com.tw.biblioteca;

import org.junit.Test;

import java.util.HashMap;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class BookLibraryTest {

    private static final String AUTHOR = "auhtor";
    private static final int YEAROFPUBLICATION = 0;
    
    @Test
    public void shouldReturnContentsOfLibrary() {
        BookLibrary bookLibrary = new BookLibrary();

        assertEquals("Name\tAuthor\tYear\nHarry Potter\tJ. K. Rowling\t1997\nTale of Two Cities\tCharles Dickens\t1859\n", bookLibrary.toString());
    }

    @Test
    public void shouldRemoveASpecifiedBookFromTheLibrary() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);

        assertTrue(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldCheckThatASpecifiedBookInTheLibraryExists() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);

        assertTrue(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldReturnFalseIfASpecifiedBookInTheDoesNotLibraryExist() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Inferno", AUTHOR, YEAROFPUBLICATION);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);

        assertFalse(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldNotRemoveABookIfItDoesNotExist() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Inferno", AUTHOR, YEAROFPUBLICATION);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);

        assertFalse(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldAddBookThatHasBeenRemovedToUnavailableList() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);

        assertTrue(bookLibrary.removeBook(book, session));
    }

    @Test
    public void shouldAddTheReturnedBookToTheBookList() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);

        bookLibrary.removeBook(book, session);

        assertTrue(bookLibrary.returnBook(book, session));
    }

    @Test
    public void shouldReturnFalseIfTheReturnedBookIsNotABookOfTheLibrary() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("inferno", AUTHOR, YEAROFPUBLICATION);
        User user = new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345);
        Session session = new Session(user);

        assertFalse(bookLibrary.returnBook(book, session));
    }

    @Test
    public void shouldAddBookAndUserToHashmap(){
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session = new Session(new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345));
        HashMap<Book, User> hashMap = new HashMap<Book, User>();
        hashMap.put(book, session.getUser());

        assertEquals(hashMap, bookLibrary.addToHashmap(book, session));
    }

    @Test
    public void shouldRemoveEntryFromBooksDetailsOnCheckinOfBook() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session = new Session(new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345));
        HashMap<Book, User> hashMap = new HashMap<Book, User>();

        bookLibrary.removeBook(book, session);

        assertEquals(hashMap, bookLibrary.removeBookAndUserFromHashmap(book));
    }

    @Test
    public void shouldReturnBookOnlyIfItsTheUserWhoCheckedItOut() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session = new Session(new User("Customer", "123-4567", "password", "abc", "abc@mail.com", 12345));

        bookLibrary.removeBook(book, session);

        assertTrue(bookLibrary.isCorrectUser(book, session));
    }

    @Test
    public void shouldReturnFalseIfITheUserWhoCheckedoutTheBookIsNotTheOneWhoReturnsTheBook() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session1 = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        Session session2 = new Session(new User("Customer", "222-2222", "password2", "abc", "abc@mail.com", 12345));

        bookLibrary.removeBook(book, session1);

        assertFalse(bookLibrary.isCorrectUser(book, session2));
    }

    @Test
    public void shouldReturnBookIfItIsReturnedByTheCorrectUser() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session1 = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        bookLibrary.removeBook(book, session1);

        assertTrue(bookLibrary.returnBook(book, session1));
    }

    @Test
    public void shouldNotReturnBookIfItIsReturnedByTheIncorrectUser() {
        BookLibrary bookLibrary = new BookLibrary();
        Book book = new Book("Harry Potter", AUTHOR, YEAROFPUBLICATION);
        Session session1 = new Session(new User("Customer", "123-4567", "password1", "abc", "abc@mail.com", 12345));
        Session session2 = new Session(new User("Customer", "222-2222", "password2", "abc", "abc@mail.com", 12345));

        bookLibrary.removeBook(book, session1);

        assertFalse(bookLibrary.returnBook(book, session2));
    }

    @Test
    public void shouldGetTheCheckoutBookDetails() {
        BookLibrary bookLibrary = new BookLibrary();
        HashMap<Book, User> hashMap = new HashMap<>();

        assertEquals(hashMap, bookLibrary.getCheckOutBookDetails());
    }
}