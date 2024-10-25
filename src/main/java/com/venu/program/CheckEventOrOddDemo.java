package com.venu.program;

import java.util.List;

public class CheckEventOrOddDemo {


    public static void main(String[] args) {


    }


    public static boolean onlyOddNumbers(List<Integer> numbers) {
        for (int i : numbers) {
            if (i % 2 == 0) {
                return false;
            }

        }
        return true;
    }




    public static boolean onlyOddData(List<Integer> list){

        return list.parallelStream().anyMatch(x -> x%2 !=0);
    }


}
