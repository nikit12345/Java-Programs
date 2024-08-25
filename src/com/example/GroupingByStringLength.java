package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.stream.Stream;

import java.util.stream.Stream;

public class GroupingByStringLength {
    public static void main(String[] args) {
        String s = "hi my name is nikita";
         Arrays.stream(s.split(" ")).map(String::length).forEach(System.out::println);;
       
    Arrays.stream(s.split(" ")).mapToInt(String::length);
    }
}


