package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when5Sort() {
        int[] data = new int[]{5, 2, 1, 4, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when3Sort() {
        int[] data = new int[]{2, 3, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3};
        assertThat(result).containsExactly(expected);
    }
}