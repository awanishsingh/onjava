package org.onjava.stream;

import java.util.Random;

public class RandomSortedNumber {


    public static void main(String[] args) {
       printingRandomNumberInSortedOrder();
    }


    public static void printingRandomNumberInSortedOrder(){
        new Random(47)
                .ints(5 , 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
