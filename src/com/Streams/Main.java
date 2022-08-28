package com.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            if (i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }

        return returnVal.toString();
    }

    public static void main(String[] args) {

         Function<String, String> fun = source -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 0) {
                    returnVal.append(source.charAt(i));
                }
            }

            return returnVal.toString();
        };

        System.out.println(fun.apply("1234567890"));



//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for (String part: parts) {
//                    System.out.println(part);
//                }
//            }
//        };
//
//        Runnable r = () -> {
//            String myString = "Let's split this up into an array";
//            String[] parts = myString.split(" ");
//            for (String part: parts) {
//                System.out.println(part);
//            }
//        };


//
//        List<String> someBingoNumbers = Arrays.asList(
//                "N40", "N36",
//                "B12", "B6",
//                "G53", "G42", "G66", "G52",
//                "I23", "I47", "I66");
//
////        List<String> gNumbers = new ArrayList<>();
////
////        someBingoNumbers.forEach(numbers -> {
////            if (numbers.startsWith("G")) {
////                gNumbers.add(numbers);
////            }
////        });
////
////        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
////        gNumbers.forEach((String s1) -> System.out.println(s1));
//
//        someBingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s->s.startsWith("G"))
//                .sorted()
//                .forEach(System.out::println);
//    }
    }
}
