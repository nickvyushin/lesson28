package com.example.lesson28;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
//        Stream.generate(() -> "Olaf Lazisson")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);


        Stream<Integer> infiniteStream = Stream.generate(() -> new Random().nextInt(1000) - 500);
        var col = infiniteStream
                .filter(i -> i % 2 == 1)
                .map(i -> i * 2)
                .limit(15)
                .peek(System.out::println)
                .collect(Collectors.toSet());
        var colSum = col.stream().mapToInt(Integer::intValue).sum();
        System.out.println(col);
        System.out.println(colSum);
    }
}
