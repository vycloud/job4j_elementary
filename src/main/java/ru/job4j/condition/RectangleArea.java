package ru.job4j.condition;

public class RectangleArea {

    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        double result = h * l;
        return result;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result = RectangleArea.square(p, k);
        System.out.printf("p = %f, k = %f, s = %f", p, k, result);
    }
}