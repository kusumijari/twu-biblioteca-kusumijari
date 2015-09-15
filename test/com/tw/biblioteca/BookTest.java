package com.tw.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class BookTest {

    @Test
    public void shouldReturnEachBookInColumnForm() {
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);

        assertEquals("Harry Potter\tJ. K. Rowling\t1997", book.toString());
    }

    @Test
    public void shouldBeEqualToItself() {
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);

        assertEquals(book, book);
    }

    @Test
    public void shouldNotBeEqualToANullObject() {
        Book book = new Book("Harry Potter", "J. K. Rowling", 1997);

        assertNotEquals(book, null);
    }

    @Test
    public void shouldNotBeEqualToAnObjectOtherThanBook() {
        Book book = new Book("Harry potter", "J. K. Rowling", 1997);

        assertNotEquals(book,"not a book object");
    }

    @Test
    public void shouldNotBeEqualToAnotherBookObjectWithDifferentName() {
        Book book = new Book("Harry potter", "J. K. Rowling", 1997);

        assertNotEquals("Tale of two cities", book);
    }

    @Test
    public void shouldBeEqualToAnotherBookObjectWithSameName() {
        Book book = new Book("Harry potter", "J. K. Rowling", 1997);

        assertNotEquals("Harry Potter", book);
    }

    @Test
    public void shouldHaveEqualHashcodesIfBooksAreEqual() {
        Book book1 = new Book("Harry Potter", "J. K. Rowling", 1997);
        Book book2 = new Book("Harry Potter", "J. K. Rowling", 1997);

        assertEquals(book1.hashCode(), book2.hashCode());
    }


}