package com.venu.program;

import java.util.Scanner;

public class Demo {


    public static void processName(Scanner scanner) {
        System.out.print("Please enter your full name: ");
        String name = scanner.next();
        System.out.print(name);
    }

    public static void main(String[] args) {
        processName(new Scanner(System.in));
    }

}
