package com.codewithrash.javaconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

        List<String> names = List.of("Rashid","Aamir","Danish","Khalid","Owais","Tom","Sam","Alex");


        Map<Integer, List<String>> collect = names.stream().collect(Collectors.groupingBy(e -> e.length()));
        collect.forEach((x, y) -> System.out.println("length = "+ x +"," +" y = "+ y));

        names.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.counting()))
                .forEach((x,y) -> System.out.println("length= "+ x +","+" Count= " + y));




    }
}
