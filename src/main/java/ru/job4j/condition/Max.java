package ru.job4j.condition;

public class Max {

    public static int max(int first, int second) {
        return first > second ? first : second;
    }    
    
    public static int max(int first, int second, int third) {
        return Math.max(first, Math.max(second, third));
    }    
    
    public static int max(int first, int second, int third, int fourth) {
        return Math.max(Math.max(first, second), Math.max(third, fourth));
    }
}
