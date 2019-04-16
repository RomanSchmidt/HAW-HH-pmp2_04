package de.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Stanislaw Brug, Roman Schmidt
 * tests for the ref day + years in the future and 5 in the past
 */
class Task04Test {

    @Test
    void get2014() {
        int year = 2014;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(20, easterDate.getDayOfMonth());
    }

    @Test
    void get2015() {
        int year = 2015;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(5, easterDate.getDayOfMonth());
    }

    @Test
    void get2016() {
        int year = 2016;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.MARCH, easterDate.getMonth());
        Assertions.assertEquals(27, easterDate.getDayOfMonth());
    }

    @Test
    void get2017() {
        int year = 2017;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(16, easterDate.getDayOfMonth());
    }

    @Test
    void get2018() {
        int year = 2018;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(1, easterDate.getDayOfMonth());
    }

    @Test
    void get2019() {
        int year = 2019;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(21, easterDate.getDayOfMonth());
    }

    @Test
    void get2020() {
        int year = 2020;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(12, easterDate.getDayOfMonth());
    }

    @Test
    void get2021() {
        int year = 2021;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(4, easterDate.getDayOfMonth());
    }

    @Test
    void get2022() {
        int year = 2022;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(17, easterDate.getDayOfMonth());
    }

    @Test
    void get2023() {
        int year = 2023;

        LocalDateTime easterDate = Task04.getEasterDate(year);
        Assertions.assertEquals(year, easterDate.getYear());
        Assertions.assertEquals(Month.APRIL, easterDate.getMonth());
        Assertions.assertEquals(9, easterDate.getDayOfMonth());
    }
}