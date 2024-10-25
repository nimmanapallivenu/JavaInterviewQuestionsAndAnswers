package com.venu.program;

public class PrimeNumberDemo {
    public static void main(String[] args) {

        System.out.println( "10 prime Number "+isPrime(10));
        System.out.println("3 prime Number "+isPrime(3));
        System.out.println("8 prime Number "+isPrime(8));
        System.out.println("7 prime Number "+isPrime(7));

    }

    public static boolean isPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
