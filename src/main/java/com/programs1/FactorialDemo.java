package com.programs1;

import java.util.Scanner;
//Enter Number:
//        5
//Factorial of Given number :
//        120
public class FactorialDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: \t ");
        int num =  scanner.nextInt();
        System.out.println("Factorial of Given number : ");
        System.out.println(printFactorials(num));

    }
    private static int printFactorials(int number){
        if(number == 0){
            return 1;
        }
        return  number * printFactorials(number-1);
    }
}
