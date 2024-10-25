package com.venu.program.demo2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumberDemo {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, 7};
        int total = input.length + 1;
        int expected_sum = IntStream.of(input).reduce(0, Integer::sum);
        int actualSum = (total * ((total + 1) / 2)); // Formula total = (n * n+1) /2
        System.out.println("Missing Number :: \t" + (actualSum - expected_sum));
    }

}


