package com.venu.program.demo2;

import java.util.Arrays;

public class MoveZerostoEndDemo {

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 3, 0, 5, 0};  // expected output : 1,2,3,4,5,0,0,0
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[count++] = arr[i];
        }
        while (count < n) {
            arr[count++] = 0;
        }
        System.out.println(Arrays.toString(arr));


    }
}
