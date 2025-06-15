package com.codewithrash.javaconcepts;

import java.util.List;

public class StreamBasics {
    public static void main(String[] args) {

        List<Integer> list1 = List.of(2,9,12,15,24,37);

        /* filter even numbers from list1 */
        List<Integer> evenList = list1.stream().filter(i -> i % 2 == 0).toList();
        System.out.println(evenList);

        /* filter numbers greater than 10 */
        List<Integer> greaterThanTenlist = list1.stream().filter(i -> i > 10).toList();
        System.out.println(greaterThanTenlist);

        char[] newChar = {'s','r','y'};
        String[] names = {"rashid", "aamir"};
        int[] no = {4, 6, 7,74};
        FilterMap[] filtmap = new FilterMap[3];
        filtmap[0]= new FilterMap();



    }
}