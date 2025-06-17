package com.codewithrash.javaconcepts;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(5,6,35,13,24,8);
        List<Integer> evenNumbers = numbers.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        List<Integer> doubleNumbers = numbers.stream().map(e -> e * 2).collect(Collectors.toList());
        System.out.println(doubleNumbers);

        Integer collectNumbers = numbers.stream().collect(Collectors.summingInt(x -> x));
        System.out.println(collectNumbers);

        Double aveNumbers = numbers.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println(aveNumbers);

        Optional<Integer> maxNumber = numbers.stream().sorted((x, y) -> x.compareTo(y) > 0 ? -1 : 1).findFirst();
        System.out.println(maxNumber.get());

        List<String> names = List.of("Rashid","Aamir","Danish","Khalid","Owais","Rashid","Tom","Sam","Alex");


        // group by on length
        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(e -> e.length()));
        collect.forEach((x, y) -> System.out.println("length = "+ x +"," +" y = "+ y));

        // group by on length with count in output
        names.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.counting()))
                .forEach((x,y) -> System.out.println("length= "+ x +","+" Count= " + y));

        //converting Map to set will remove duplicate automatically
        Set<String> removeDuplicate = names.stream().collect(Collectors.toSet());
        removeDuplicate.forEach(x-> System.out.println(x));







    }
}
