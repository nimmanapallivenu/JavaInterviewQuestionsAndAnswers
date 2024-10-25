package com.venu.program.demo2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordsDemo {

    public static void main(String[] args) {
        String input =" big black bug a big blck dog on his big black nose";
        input = input.toLowerCase();
        String [] words = input.split(" ");
        Set<String> wordsSet = new HashSet<>();
        List<String> duplicateWords = Stream.of(words).filter(w ->!wordsSet.add(w)).collect(Collectors.toList());
        System.out.println("Duplicate words are ");
        System.out.println(duplicateWords);



    }
}
