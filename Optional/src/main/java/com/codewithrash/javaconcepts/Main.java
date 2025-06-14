package com.codewithrash.javaconcepts;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

         String str = "i Like Java";
         TestOptional(str);
    }

    public static void TestOptional(String str) {

//       of() will Convert str object to Optional object, get() will fetch str object from optional
        Optional<String> optional1 = Optional.of(str);
        String s1 = optional1.get();
        System.out.println(s1);

//        ofNullable() will return str if string is not null, will return null if no string
        Optional<String> optional2 = Optional.ofNullable(str);
        System.out.println(optional2.isPresent());
        System.out.println(optional2.orElse("This is Empty String"));






    }
}