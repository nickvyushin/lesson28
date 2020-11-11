package com.example.lesson28;

public class OneZeroLine {

    public static Integer maxOnesLine(String str) {
        var count1 = 0;
        var count2 = 0;

        if (str == null || str.isBlank()) {
            return -1;
        } else {
            for (int i = 0; i < str.length(); i++) {
                var ch = str.charAt(i);

                if (Character.isLetter(ch) || ch != '1' && ch != '0') {
                    return -1;
                }

                if (ch == '1') {
                    count1++;
                    if (i == str.length() - 1) {
                        count2 = count1;
                    }
                } else {
                    if (count1 > count2) {
                        count2 = count1;
                    }
                    count1 = 0;
                }
            }
        }
        return count2;
    }
}
