package com.qa.TestingGoDemo;
import java.util.*;
import java.util.stream.*;

public class SecondHighest {

    public static void main(String[] args) {

        int b[] = {44, 66, 99, 77, 33, 22};

        Optional<Integer> secondHighest = Arrays.stream(b)
                .boxed()                      // convert int → Integer
                .distinct()                   // remove duplicates
                .sorted(Comparator.reverseOrder()) // descending order
                .skip(1)                      // skip highest
                .findFirst();                 // get 2nd highest

        if (secondHighest.isPresent()) {
            System.out.println("Second Highest: " + secondHighest.get());
        } else {
            System.out.println("Not enough elements");
        }
    }
}