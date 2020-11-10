package com.example.lesson28;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

import static com.example.lesson28.Palindrom.isPalindrom;

@SpringBootApplication
public class Lesson28Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Lesson28Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        System.out.println("Hello, World!");
//        System.out.println(isPalindrom("довод"));  //true
//        System.out.println(isPalindrom("123321")); //false
//        System.out.println(isPalindrom("урок"));   //false
//        System.out.println(isPalindrom(null));     //false
//        System.out.println(isPalindrom(""));       //false
//        System.out.println(isPalindrom(" "));      //false
//        System.out.println(isPalindrom("яя"));     //true
//        System.out.println(isPalindrom("батон"));  //false
//        System.out.println(isPalindrom("я"));      //true
//        System.out.println(isPalindrom("тОПоТ"));  //true

//        sortByLength.
//        Collections.sort(list, comparator);
//        System.out.println(list);

        var scanner = new Scanner(System.in);
    }
}
