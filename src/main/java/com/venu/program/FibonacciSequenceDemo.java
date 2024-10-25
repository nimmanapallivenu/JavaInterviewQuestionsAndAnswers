package com.venu.program;

public class FibonacciSequenceDemo {


    public static void main(String[] args) {


       printFibonacciSequence(10);

       System.out.println();


        int num = 10;
        for(int i=0;i<num;i++){
            System.out.print(fibonnacci(i)+",");
        }


    }

    public static int fibonnacci(int count){

        if(count <=1){
            return count;
        }
        return fibonnacci(count-1)+ fibonnacci(count-2);
    }






    public static void printFibonacciSequence(int count) {

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {

            System.out.print(a + " ,");
            a = b;
            b = c;
            c = a + b;

        }


    }

}
