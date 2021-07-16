package ru.netology.manager;


import org.junit.jupiter.api.Test;
import ru.netology.domain.Movie;

import static org.junit.jupiter.api.Assertions.*;

    class MovieManagerTest {

        @Test
        public void shouldShowAllMovies() {
            MovieManager manager = new MovieManager();

            Movie first = new Movie(1, "Bladshot", "http://", "actionMovie");
            Movie second = new Movie(2, "Ahead", "http://", "cartoon");
            Movie third = new Movie(3, "HotelBelgrad", "http://", "comedy");
            Movie fourth = new Movie(4, "Gentlemen", "http://", "actionMovie");
            Movie fifth = new Movie(5, "InvisibleMan", "http://", "horrors");
            Movie sixth = new Movie(6, "Trolls", "http://", "cartoon");
            Movie seventh = new Movie(7, "NumberOne", "http://", "comedy");
            Movie eighth = new Movie(8, "Cruella", "http://", "comedy");
            Movie ninth = new Movie(9, "BlackWidow", "http://", "fantasy");
            Movie tenth = new Movie(10, "SpaceJam", "http://", "fantasy");

            manager.addMovie(first);
            manager.addMovie(second);
            manager.addMovie(third);
            manager.addMovie(fourth);
            manager.addMovie(fifth);
            manager.addMovie(sixth);
            manager.addMovie(seventh);
            manager.addMovie(eighth);
            manager.addMovie(ninth);
            manager.addMovie(tenth);

            Movie[] actual = manager.getLast();
            Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
            assertArrayEquals(expected, actual);
        }


        @Test
        public void mustShowNineMovie() {
            MovieManager manager = new MovieManager();

            Movie first = new Movie(1, "Bladshot", "http://", "actionMovie");
            Movie second = new Movie(2, "Ahead", "http://", "cartoon");
            Movie third = new Movie(3, "HotelBelgrad", "http://", "comedy");
            Movie fourth = new Movie(4, "Gentlemen", "http://", "actionMovie");
            Movie fifth = new Movie(5, "InvisibleMan", "http://", "horrors");
            Movie sixth = new Movie(6, "Trolls", "http://", "cartoon");
            Movie seventh = new Movie(7, "NumberOne", "http://", "comedy");
            Movie eighth = new Movie(8, "Cruella", "http://", "comedy");
            Movie ninth = new Movie(9, "BlackWidow", "http://", "fantasy");
            Movie tenth = new Movie(10, "SpaceJam", "http://", "fantasy");

            manager.addMovie(second);
            manager.addMovie(third);
            manager.addMovie(fourth);
            manager.addMovie(fifth);
            manager.addMovie(sixth);
            manager.addMovie(seventh);
            manager.addMovie(eighth);
            manager.addMovie(ninth);
            manager.addMovie(tenth);

            Movie[] actual = manager.getLast();
            Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};//, first};
            assertArrayEquals(expected, actual);

        }

        @Test
        void mustShowNothing() {
            MovieManager manager = new MovieManager(0);
            Movie[] actual = manager.getLast();
            Movie[] expected = new Movie[0];
            assertArrayEquals(expected, actual);
        }

        @Test
        void mustShowValid() {
            MovieManager manager = new MovieManager(5);

            Movie sixth = new Movie(6, "Trolls", "http://", "cartoon");
            Movie seventh = new Movie(7, "NumberOne", "http://", "comedy");
            Movie eighth = new Movie(8, "Cruella", "http://", "comedy");
            Movie ninth = new Movie(9, "BlackWidow", "http://", "fantasy");
            Movie tenth = new Movie(10, "SpaceJam", "http://", "fantasy");

            manager.addMovie(sixth);
            manager.addMovie(seventh);
            manager.addMovie(eighth);
            manager.addMovie(ninth);
            manager.addMovie(tenth);

            Movie[] actual = manager.getLast();
            Movie[] expected = new Movie[]{tenth, ninth, eighth, seventh, sixth};

            assertArrayEquals(expected, actual);


        }

        @Test
        void mustShowOverMax() {
            MovieManager manager = new MovieManager(11);
            Movie first = new Movie(1, "Bladshot", "http://", "actionMovie");
            Movie second = new Movie(2, "Ahead", "http://", "cartoon");
            Movie third = new Movie(3, "HotelBelgrad", "http://", "comedy");
            Movie fourth = new Movie(4, "Gentlemen", "http://", "actionMovie");
            Movie fifth = new Movie(5, "InvisibleMan", "http://", "horrors");
            Movie sixth = new Movie(6, "Trolls", "http://", "cartoon");
            Movie seventh = new Movie(7, "NumberOne", "http://", "comedy");
            Movie eighth = new Movie(8, "Cruella", "http://", "comedy");
            Movie ninth = new Movie(9, "BlackWidow", "http://", "fantasy");
            Movie tenth = new Movie(10, "SpaceJam", "http://", "fantasy");

            manager.addMovie(second);
            manager.addMovie(third);
            manager.addMovie(fourth);
            manager.addMovie(fifth);
            manager.addMovie(sixth);
            manager.addMovie(seventh);
            manager.addMovie(eighth);
            manager.addMovie(ninth);
            manager.addMovie(tenth);

            Movie movieToAdd = new Movie(11, "Trainspotting18", "http://", "drama");
            manager.addMovie(movieToAdd);
            Movie[] actual = manager.getLast();
            Movie[] expected = {new Movie(11, "Trainspotting18", "http://", "drama"), tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
            assertArrayEquals(expected, actual);

        }
    }

