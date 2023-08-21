package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void ref00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2.0;
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void ref01to20then2dot23() {
        Point a = new Point(0, 1);
        Point b = new Point(2, 0);
        double expected = 2.23;
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void ref11to42then3dot16() {
        Point a = new Point(1, 1);
        Point b = new Point(4, 2);
        double expected = 3.16;
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void ref11to20then1dot41() {
        Point a = new Point(1, 1);
        Point b = new Point(2, 0);
        double expected = 1.41;
        double actual = a.distance(b);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void p3d001to020then2dot24() {
        Point a3 = new Point(0, 0, 1);
        Point b3 = new Point(0, 2, 0);
        double expected = 2.24;
        double actual = a3.distance3d(b3);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void p3d1005to301020then26dot93() {
        Point a3 = new Point(10, 0, 5);
        Point b3 = new Point(30, 10, 20);
        double expected = 26.93;
        double actual = a3.distance3d(b3);
        assertThat(actual).isEqualTo(expected, withPrecision(0.01));
    }
}