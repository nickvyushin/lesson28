package com.example.lesson28;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

interface TriFunction<F, S, T, V> {

    V apply(F s1, S s2, T s3);

}

interface QuadFunction<F, S, T, V, E> {

    E apply(F s1, S s2, T s3, V s4);

}



public class LambdaExample {

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T elem : list) {
            consumer.accept(elem);
        }
    }

    static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> list2 = new ArrayList<>();
        for (T elem : list) {
            if (predicate.test(elem))
                list2.add(elem);
            }
            return list2;
        }


    TriFunction<Integer, Integer, Integer, Integer> func = (a,b,c) -> a + b + c;


    QuadFunction<Integer, Integer, Integer, Integer, Integer> func1 = (a,b,c,d) -> a + b + c + d;

    static <T,R> List<R> map(List<T> origin, Function<T, R> mapper) {
        List<R> newList = new ArrayList<>();
        for (T elem : origin) {
            newList.add(mapper.apply(elem));
        }
        return newList;
    }

    static <T> T reduce(List<T> origin, BinaryOperator<T> operator) {
        while (origin.size() > 1) {
            origin.add(0, operator.apply(origin.remove(0), origin.remove(0)));
        }
        return origin.get(0);
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(-1);
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(15);
        list.add(-5);
        list.add(6);
        list.removeIf(e -> e < 0);
        //list.removeIf(e -> e % 2 == 1);
       // list.forEach(System.out::println);

      //  filter(list, e -> e % 2 == 1);

       // forEach(list, System.out::println);

        //forEach(map(list, i -> Integer.toString(i) + ","), System.out::println);
        System.out.println(reduce(list, Integer::sum));

    }


}
