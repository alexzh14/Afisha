package ru.netology.afisha;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    @Test
    public void shouldFindAllMoviesNormalWay() {
        AfishaManager manager = new AfishaManager();

        manager.add("Mission impossible 1");
        manager.add("Mission impossible 2");
        manager.add("Mission impossible 3");

        String[] actual = manager.findAll();
        String[] expected = {"Mission impossible 1", "Mission impossible 2", "Mission impossible 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesDefaultLimit() {
        AfishaManager manager = new AfishaManager();

        manager.add("Mission impossible 1");
        manager.add("Mission impossible 2");
        manager.add("Mission impossible 3");
        manager.add("Mission impossible 4");
        manager.add("Mission impossible 5");
        manager.add("Mission impossible 6");

        String[] actual = manager.findLast();
        String[] expected = {"Mission impossible 6", "Mission impossible 5", "Mission impossible 4", "Mission impossible 3", "Mission impossible 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesManualLimit() {
        AfishaManager manager = new AfishaManager(6);

        manager.add("Mission impossible 1");
        manager.add("Mission impossible 2");
        manager.add("Mission impossible 3");
        manager.add("Mission impossible 4");
        manager.add("Mission impossible 5");
        manager.add("Mission impossible 6");
        manager.add("Mission impossible 7");

        String[] actual = manager.findLast();
        String[] expected = {"Mission impossible 7", "Mission impossible 6", "Mission impossible 5", "Mission impossible 4", "Mission impossible 3", "Mission impossible 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesLessThanDefaultLimit() {
        AfishaManager manager = new AfishaManager();

        manager.add("Mission impossible 1");
        manager.add("Mission impossible 2");
        manager.add("Mission impossible 3");

        String[] actual = manager.findLast();
        String[] expected = {"Mission impossible 3", "Mission impossible 2", "Mission impossible 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastMoviesLessThanManualLimit() {
        AfishaManager manager = new AfishaManager(4);

        manager.add("Mission impossible 1");
        manager.add("Mission impossible 2");
        manager.add("Mission impossible 3");

        String[] actual = manager.findLast();
        String[] expected = {"Mission impossible 3", "Mission impossible 2", "Mission impossible 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
}