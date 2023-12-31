package ru.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return result;
    }

    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 1;
        int x2 = 9;
        int y2 = 4;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.printf("result (%d, %d) to (%d, %d): %f", x1, y1, x2, y2, result);
    }
}