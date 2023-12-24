package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FactorialTest {

    @Test
    void whenCalculateFactorialFor5Then120() {
        int n = 5;
        int output = Factorial.calc(n);
        int expected = 120;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor0Then1() {
        int n = 0;
        int output = Factorial.calc(n);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor1Then1() {
        int n = 1;
        int output = Factorial.calc(n);
        int expected = 1;
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialFor2Then2() {
        int n = 2;
        int output = Factorial.calc(n);
        int expected = 2;
        assertThat(output).isEqualTo(expected);
    }
}