package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[] {7, 2, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {2, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[] {12, 3, 0, 6, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 3, 4, 6, 12};
        assertThat(result).containsExactly(expected);
    }
}