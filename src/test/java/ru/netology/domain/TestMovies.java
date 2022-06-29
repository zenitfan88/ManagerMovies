package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMovies {

    PurchaseItem first = new PurchaseItem(111, "Фильм1", "Жанр1");
    PurchaseItem second = new PurchaseItem(222, "Фильм2", "Жанр2");
    PurchaseItem third = new PurchaseItem(333, "Фильм3", "Жанр3");
    PurchaseItem fourth = new PurchaseItem(444, "Фильм4", "Жанр4");
    PurchaseItem fifth = new PurchaseItem(555, "Фильм5", "Жанр5");
    PurchaseItem sixth = new PurchaseItem(666, "Фильм6", "Жанр6");
    PurchaseItem seventh = new PurchaseItem(777, "Фильм7", "Жанр7");
    PurchaseItem eighth = new PurchaseItem(888, "Фильм8", "Жанр8");
    PurchaseItem ninth = new PurchaseItem(999, "Фильм9", "Жанр9");
    PurchaseItem tenth = new PurchaseItem(100, "Фильм10", "Жанр10");
    PurchaseItem eleventh = new PurchaseItem(011, "Фильм11", "Жанр11");

    @Test
    public void testMoviesFindLastDefault() {
        ManagerMovies movies = new ManagerMovies(0);
        movies.save(first);
        movies.save(second);
        movies.save(third);
        movies.save(fourth);
        movies.save(fifth);
        movies.save(sixth);
        movies.save(seventh);
        movies.save(eighth);
        movies.save(ninth);
        movies.save(tenth);
        movies.save(eleventh);
        PurchaseItem[] actual = movies.findLast();
        PurchaseItem[] expected = {tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesFindLastOverLimit() {
        ManagerMovies movies = new ManagerMovies(7);
        movies.save(first);
        movies.save(second);
        movies.save(third);
        movies.save(fourth);
        movies.save(fifth);
        movies.save(sixth);
        movies.save(seventh);
        movies.save(eighth);
        movies.save(ninth);
        movies.save(tenth);
        movies.save(eleventh);
        PurchaseItem[] actual = movies.findLast();
        PurchaseItem[] expected = {seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesFindLastLessLimit() {
        ManagerMovies movies = new ManagerMovies(20);
        movies.save(first);
        movies.save(second);
        movies.save(third);
        movies.save(fourth);
        movies.save(fifth);
        movies.save(sixth);
        movies.save(seventh);
        movies.save(eighth);
        movies.save(ninth);
        movies.save(tenth);
        movies.save(eleventh);
        PurchaseItem[] actual = movies.findLast();
        PurchaseItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testMoviesFindLastEqualLimit() {
        ManagerMovies movies = new ManagerMovies(11);
        movies.save(first);
        movies.save(second);
        movies.save(third);
        movies.save(fourth);
        movies.save(fifth);
        movies.save(sixth);
        movies.save(seventh);
        movies.save(eighth);
        movies.save(ninth);
        movies.save(tenth);
        movies.save(eleventh);
        PurchaseItem[] actual = movies.findLast();
        PurchaseItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testMoviesFindAll() {
        ManagerMovies movies = new ManagerMovies();
        movies.save(first);
        movies.save(second);
        PurchaseItem[] actual = movies.findAll();
        PurchaseItem[] expected = {first, second};
        Assertions.assertArrayEquals(expected, actual);
    }
}
