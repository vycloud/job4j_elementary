package ru.job4j.loop;

public class CheckPrimeNumber {

    public static boolean check(int number) {
        boolean prime = true;

        if (number <= 1) {
            return false;
        }
        for (int div = 2; div < number; div++) {
            if (number % div == 0) {
                prime = false;
                break;
            }
        }

        return prime;
    }
}
