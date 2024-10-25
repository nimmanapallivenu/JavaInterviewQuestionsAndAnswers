package com.venu.program.demo2;

public class ReverseStringDemo {

    public static void main(String[] args) {
        System.out.print(reverse("india is my country"));
    }

    static String reverse(String str) {
        char[] inpArr = str.toCharArray();
        char[] result = new char[str.length()];

        for (int i = inpArr.length - 1, j = 0; i >= 0; i--, j++) {
            result[j] = inpArr[i];
        }
        return String.valueOf(result);
    }


}

