package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] postfix) {
        boolean result = true;
        for (int index = word.length - postfix.length; index < word.length; index++) {
            if (word[index] != postfix[index - postfix.length - 1]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
