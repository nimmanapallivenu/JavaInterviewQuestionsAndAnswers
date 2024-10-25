package com.programs1;

//a = 10
//b = 15
//After Swap
//a = 15
//b = 10
public class SwapTwoNumbersDemo {
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
