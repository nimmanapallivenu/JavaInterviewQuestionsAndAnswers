package com.venu.program.demo2;

public class SwapTwoValuesDemo {

    public static void main(String[] args) {
        swampIntegers();
        swapStrings();
    }

    public static void swampIntegers(){
        int a=10,b=20;
        System.out.println( "Before Swap Numbers are :: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        a = a+b;
        b=a-b;
        a =a-b;
        System.out.println("======");
        System.out.println( "After Swap Numbers are :: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

    }


    public static void swapStrings(){
        String a = "hello";
        String b= "word";
        System.out.println( "Before Swap  are :: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        a = a+b;
        b=a.substring(0,a.length()-b.length());
        a = a.substring(a.length()-b.length()+1);
        System.out.println("======");
        System.out.println( "After Swap  are :: ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);




    }

}
