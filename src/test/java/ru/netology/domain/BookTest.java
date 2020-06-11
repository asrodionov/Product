package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {

    @Test
    public void shouldFindBookOfName() {

        Book book = new Book();

        book.setName("Война и мир");
        book.setAuthor("Лев Толстой");

        boolean expected = true;
        boolean actual = book.matches("Война и мир");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindBookOfAuthor() {

        Book book = new Book();

        book.setName("Война и мир");
        book.setAuthor("Лев Толстой");

        boolean expected = true;
        boolean actual = book.matches("Лев Толстой");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindBookOfName() {

        Book book = new Book();

        book.setName("Война и мир");
        book.setAuthor("Лев Толстой");

        boolean expected = false;
        boolean actual = book.matches("Преступление и наказание");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotFindBookOfAuthor() {

        Book book = new Book();

        book.setName("Война и мир");
        book.setAuthor("Лев Толстой");

        boolean expected = false;
        boolean actual = book.matches("Федор Достоевский");

        assertEquals(expected, actual);
    }
}