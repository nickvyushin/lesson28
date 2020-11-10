package com.example.lesson28;

public class Palindrom {

    public static boolean isPalindrom(String str) {
        if (str == null || str.isBlank()) {
            return false;
        } else {
            str = str.toLowerCase();

        }
        for (int i = 0; i < str.length() / 2; i++) {
            var char1 = str.charAt(i);
            var char2 = str.charAt(str.length() - i - 1);
            if (!Character.isLetter(char1) || !Character.isLetter(char2) || char1 != char2) {
                return false;
            }
        }
        return true;
    }
}
