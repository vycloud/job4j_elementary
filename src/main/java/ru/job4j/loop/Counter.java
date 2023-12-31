package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {
        int sum = 0;
        for (int number = start; number <= finish; number++) {
            sum += number;
        }
        return sum;
    }

    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int number = start; number <= finish; number++) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}