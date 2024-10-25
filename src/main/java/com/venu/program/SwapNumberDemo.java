package com.venu.program;

public class SwapNumberDemo {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swap a=" + a + " B value =" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap value a=" + a + " B = " + b);

    }
}
