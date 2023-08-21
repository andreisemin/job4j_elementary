package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2To3To4Then2To3To4() {
        int left = 1;
        int right = 2;
        int up = 3;
        int down = 4;
        int result = Max.max(left, right);
        int expected1 = 2;
        assertThat(result).isEqualTo(expected1);
        int result2 = Max.max(left, right, up);
        int expected2 = 3;
        assertThat(result2).isEqualTo(expected2);
        int result3 = Max.max(left, right, up, down);
        int expected3 = 4;
        assertThat(result3).isEqualTo(expected3);
    }

    @Test
    void whenMax10To2To5To15Then10To10To15() {
        int left = 10;
        int right = 2;
        int up = 5;
        int down = 15;
        int result = Max.max(left, right);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
        int result2 = Max.max(left, right, up);
        int expected2 = 10;
        assertThat(result2).isEqualTo(expected2);
        int result3 = Max.max(left, right, up, down);
        int expected3 = 15;
        assertThat(result3).isEqualTo(expected3);
    }

    @Test
    void whenMax1To5To10To7Then5To10To10() {
        int left = 1;
        int right = 5;
        int up = 10;
        int down = 7;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
        int result2 = Max.max(left, right, up);
        int expected2 = 10;
        assertThat(result2).isEqualTo(expected2);
        int result3 = Max.max(left, right, up, down);
        int expected3 = 10;
        assertThat(result3).isEqualTo(expected3);
    }

    @Test
    void whenMax2To2To1To1Then2To2To2() {
        int left = 2;
        int right = 2;
        int up = 1;
        int down = 1;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
        int result2 = Max.max(left, right, up);
        int expected2 = 2;
        assertThat(result2).isEqualTo(expected2);
        int result3 = Max.max(left, right, up, down);
        int expected3 = 2;
        assertThat(result3).isEqualTo(expected3);
    }
}