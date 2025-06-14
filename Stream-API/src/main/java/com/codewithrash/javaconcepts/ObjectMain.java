package com.codewithrash.javaconcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ObjectMain {
    public static void main(String[] args) {

        /* 1- empty Stream */
        Stream<Object> emptyStream = Stream.empty();

        /* 2- Array, Object, Collection */
        String names[] = {"Rashid", "Owais", "Khalid","Aamir", "Danish"};
        Stream<String> names1 = Stream.of(names);
        names1.forEach(System.out::println);

        /* 3- Builder */
        Stream<Object> streamBuilder = Stream.builder().build();

        /* 4- */
        IntStream arrayStream = Arrays.stream(new int[]{5, 6, 11, 8, 14});
        arrayStream.forEach(System.out::println);

        /* List, Set */

        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(15);
        integerList.add(10);
        integerList.add(25);

        Stream<Integer> listStream = integerList.stream();
        listStream.forEach(System.out::println);
    }



}
