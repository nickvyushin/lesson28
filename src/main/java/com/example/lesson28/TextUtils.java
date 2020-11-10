package com.example.lesson28;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class TextUtils {

    public static void sortByLengthOld(ArrayList<String> array) {
        array.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
    }
    public static void sortByLength(ArrayList<String> array) {
        array.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
