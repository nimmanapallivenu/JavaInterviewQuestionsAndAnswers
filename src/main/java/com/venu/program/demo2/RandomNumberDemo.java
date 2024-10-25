package com.venu.program.demo2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberDemo {

    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            System.out.println("Random Number is:: \t" + getRandomNumber(1,10));

        }

        System.out.println("====================");
        for(int i=0;i<5;i++){
            System.out.println("Random Number is:: \t" + getRandomNum(1,10));
        }
    }

    public static int getRandomNumber (int min,int max){
        return ThreadLocalRandom.current().nextInt(min,max);
    }


    public static int getRandomNum(int min,int max){
        return new Random().nextInt(max-min+1)+min;
    }
}
