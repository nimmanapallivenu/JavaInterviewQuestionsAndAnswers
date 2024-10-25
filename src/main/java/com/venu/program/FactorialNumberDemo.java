package com.venu.program;

import java.util.Scanner;

public class FactorialNumberDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Factorial Number");
        int num = scanner.nextInt();

        int fact = 1;

        for(int i=1;i<=num;i++){
            fact *=i;
        }

        System.out.println("factorail Output = " + fact);

    }

}
