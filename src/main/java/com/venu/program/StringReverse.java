package com.venu.program;

public class StringReverse {


    public static void main(String[] args) {

        String value = "venugopal";

        System.out.println(reverse((value)));
    }

    public static String reverse(String value) {

        if (value == null) {
            throw new IllegalArgumentException("Null is not valid input");

        }

        StringBuilder builder = new StringBuilder();

        char[] inChar = value.toCharArray();

        for (int i = inChar.length - 1; i >= 0; i--) {
            {
                builder.append(inChar[i]);
            }
        }
        return builder.toString();


    }
}
