package com.example.lesson28;

import java.util.ArrayList;

public class OneZeroLine {

    public static String maxOnesLine(String str) {
        var onesLine = new ArrayList<Character>();
        if (str == null || str.isBlank()) {
            return "Некорректная строка";
        } else {
            for (int i = 0; i < str.length(); i++) {
                var ch = str.charAt(i);
                if (Character.isLetter(ch) && ch != '1' && ch != '0') {
                    return "Некорректная строка";
                } else if (ch == '1') {
                    onesLine.add(ch);
                } else {
                    onesLine.clear();
                }
            }
        }
        StringBuilder res = new StringBuilder();
        if (!onesLine.isEmpty()) {
            for (Character character : onesLine) {
                String s = character.toString();
                res.append(s);
            }
            return res.toString();
        } else {
            return "Некорректная строка";
        }
    }
}
