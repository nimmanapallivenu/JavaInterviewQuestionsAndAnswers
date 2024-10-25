package com.venu.program;


import java.util.Arrays;
import java.util.List;

public class PalindromeDemo {


    public static void main(String[] args) {

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,5,6,7,7,9);

        System.out.println(numbers.stream().limit(3).toArray());

    }

}
