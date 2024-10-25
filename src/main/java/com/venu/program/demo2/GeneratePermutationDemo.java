package com.venu.program.demo2;

public class GeneratePermutationDemo {
    public static void main(String[] args) {

        String input = "ABC";
        int length = input.length();
        System.out.println("All the Purmutation of the String are:: ");
        generatePurmutation(input, 0, length);
    }

    private static void generatePurmutation(String input, int start, int end) {

        if (start == end - 1) {
            System.out.println(input);
        } else {
            for (int i = start; i < end; i++) {
                input = swapString(input, start, i);
                generatePurmutation(input, start + 1, end);
            }
        }

    }


    public static String swapString(String input, int i, int j) {
        char[] b = input.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }


}
