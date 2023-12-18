package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float inputEuro = 140;
        float inputDollars = 300;
        float expectedEuro = 2;
        float expectedDollars = 5;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        float outputDollars = Converter.rubleToDollar(inputDollars);
        boolean passedEuro = expectedEuro == outputEuro;
        boolean passedDollars = expectedDollars == outputDollars;
        System.out.printf("140 rubles are %.2f euro. Test result : %b%n", outputEuro, passedEuro);
        System.out.printf("300 rubles are %.2f dollars. Test result : %b%n", outputDollars, passedDollars);
    }
}