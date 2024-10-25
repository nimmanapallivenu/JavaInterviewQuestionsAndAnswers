package com.programs1;

import java.util.Scanner;

//Enter number range
//10
//Fibonacci Series Numbers ....
//
//        0 1 1 2 3 5 8 13 21 34
public class FibonacciSeriesDemo {

    public static void main(String[] args) {
        System.out.println("Enter number range");
        Scanner scanner = new Scanner(System.in);
        int range = scanner.nextInt();
        printFibonacciNumbers(range);
    }

    private static void printFibonacciNumbers(int number) {
        System.out.println(" Fibonacci Series Numbers ....");
        System.out.println();
        int first = 0, second = 1, next;
        for (int i = 0; i < number; i++) {
            System.out.print(first + " ");
            next = first + second;
            first = second;
            second = next;
        }

    }


}
