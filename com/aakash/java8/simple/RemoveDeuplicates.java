package com.aakash.java8.simple;

import java.util.Arrays;
import java.util.List;

public class RemoveDeuplicates {
    public static void main(String[] args) {
        List<String> fruitList= Arrays.asList("apple", "banana", "apple", "orange", "grapes", "grapes");

        fruitList.stream().distinct().forEach(System.out::println);

    }
}
