package com.programs1;

import java.util.Scanner;
//21
//Given number is Odd number 21
public class FindEventOddNumberDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        boolean isEventNumber = isEventNumber(number);
        if (isEventNumber) {
            System.out.print("Given number is Event number " + number);
        } else {
            System.out.print("Given number is Odd number " + number);
        }
    }

    private static boolean isEventNumber(long number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
