package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Ivan Ivanov";
        names[1] = "Petr Petrov";
        names[2] = "Roman Romanov";
        names[3] = "Boris Borisov";
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        for (int index = 0; index < names.length; index++) {
            System.out.println(names[index]);
        }
    }
}
