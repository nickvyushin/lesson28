package com.example.lesson28;

import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
//        Stream.generate(() -> "Olaf Lazisson")
//                .filter(n -> n.length() == 4)
//                .limit(2)
//                .sorted()
//                .forEach(System.out::println);


//        Stream<Integer> infiniteStream = Stream.generate(() -> new Random().nextInt(1000) - 500);
//        var col = infiniteStream
//                .filter(i -> i % 2 == 1)
//                .map(i -> i * 2)
//                .limit(15)
//                .peek(System.out::println)
//                .collect(Collectors.toSet());
//        var colSum = col.stream().mapToInt(Integer::intValue).sum();
////        System.out.println(col);
////        System.out.println(colSum);
//
//
//        Stream<Integer> itegerStream = Stream.of(1, 2, 3);
//        IntStream intstream = IntStream.of(1, 2, 3);


        System.out.println(division(1, 0));


    }

    private static Optional<Double> division(int num1, int num2) {
        double result;
        if (num2 == 0) {
            return Optional.empty();
        }
        result = (double) num1 / num2;
        return Optional.of(result);
    }
}
