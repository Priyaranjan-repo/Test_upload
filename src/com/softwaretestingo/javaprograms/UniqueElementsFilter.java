package com.softwaretestingo.javaprograms;
import java.util.*;
import java.util.stream.Collectors;

public class UniqueElementsFilter {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(2, 1, 1, 4, 5, 5, 6, 7);   //[2, 4, 6, 7]

        
        List<Integer> result = input.stream()
        
        		.collect(Collectors.groupingBy(e -> e, LinkedHashMap::new, Collectors.counting()))
            
        		.entrySet()
            
        		.stream()
            
        		.filter(entry -> entry.getValue() == 1)
            
        		.map(Map.Entry::getKey)
            
        		.collect(Collectors.toList());

        
        System.out.println("Output: " + result);
    }
}
