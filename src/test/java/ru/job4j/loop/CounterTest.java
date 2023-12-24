package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFrom100To1000Then495550() {
        int start = 100;
        int finish = 1000;
        int result = Counter.sum(start, finish);
        int expected = 495550;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFrom1To1Then1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFrom5To3Then0() {
        int start = 5;
        int finish = 3;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenNumbersFrom3To10Then8() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenNumbersFrom1To1Then0() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEvenNumbersFromMinus10To8ThenMinus10() {
        int start = -10;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = -10;
        assertThat(result).isEqualTo(expected);
    }
}
