package com.programs1;

import java.util.Scanner;

public class ReverseNumberDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Input Number ");
        int number=  scanner.nextInt();
        long reverseNum = 0 ,reminder=0;
        while(number>0){
         reminder = number%10;
         reverseNum = reverseNum *10 +reminder;
         number = number/10;
        }

        System.out.println();
        System.out.println(" Reverse Number");
        System.out.println(reverseNum);
    }

}
