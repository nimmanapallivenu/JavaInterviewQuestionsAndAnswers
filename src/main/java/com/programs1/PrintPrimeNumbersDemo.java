package com.programs1;

import java.util.Scanner;

//Enter  number range
//10
//Prime Numbers are :
//
//        2 3 5 7
public class PrintPrimeNumbersDemo {

    public static void main(String[] args) {

        System.out.println("Enter  number range");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        printPrimeNumbers(number);
    }

    private static void printPrimeNumbers(int number) {
        System.out.println(" Prime Numbers are : ");
        System.out.println();

        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }


    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;

    }


}
