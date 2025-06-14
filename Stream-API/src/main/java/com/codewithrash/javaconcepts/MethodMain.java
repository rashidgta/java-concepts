package com.codewithrash.javaconcepts;

import java.util.ArrayList;
import java.util.List;

public class MethodMain {
    public static void main(String[] args) {

        // filter(Predicate)
        // Predicate is Boolean value function which returns true or false
        // filter will fetch elements based on Boolean and build stream

        List<String> names = List.of("Aamir", "Rashid", "Ankit", "Abhinav");
        List<String> namesStartWithA = names.stream().filter(e -> e.startsWith("A")).toList();
        System.out.println(namesStartWithA);
        names.forEach(e-> System.out.println());

        //map (Function)
        // Function will perform operation on each element and returns value
        // map will build stream based on returned value

        List<Integer> numbers = List.of(5,7,8,9,4,17);
        List<Integer> squareNumbers = numbers.stream().map(e -> e * e).toList();
        System.out.println(squareNumbers);

        numbers.stream().sorted().forEach(System.out::println);

        Integer maxNumber = numbers.stream().max((x, y)-> x.compareTo(y)).get();
        System.out.println("Max no is = " + maxNumber);

        Integer minNumber = numbers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min no is = " + minNumber);


    }
}
