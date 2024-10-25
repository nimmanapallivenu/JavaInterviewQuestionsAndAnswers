package com.programs1;

import java.util.Scanner;
//Enter Number 10
//
//Even Numbers Are :
//        0 2 4 6 8
//Odd Numbers Are :
//        1 3 5 7 9
public class EvenOddNumberDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number");
        int number = scanner.nextInt();

        printEventNumbers(number);
        printOddNumbers(number);
    }

    private static void printEventNumbers(int number) {
        System.out.println();
        System.out.println("Even Numbers Are : \t " );
        for (int i = 0; i < number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }

    private static void printOddNumbers(int number) {
        System.out.println();
        System.out.println("Odd Numbers Are : \t " );
        for (int i = 0; i < number; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }


}
