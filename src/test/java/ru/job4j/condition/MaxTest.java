package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To5Then10() {
        int first = 10;
        int second = 5;
        int result = Max.max(first, second);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7Then7() {
        int first = 7;
        int second = 7;
        int result = Max.max(first, second);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To5To10Then10() {
        int first = 7;
        int second = 5;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax7To7To5To5Then7() {
        int first = 7;
        int second = 7;
        int third = 5;
        int fourth = 5;
        int result = Max.max(first, second, third, fourth);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
