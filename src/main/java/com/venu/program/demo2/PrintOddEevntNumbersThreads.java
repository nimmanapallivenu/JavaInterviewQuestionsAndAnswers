package com.venu.program.demo2;

public class PrintOddEevntNumbersThreads {

    public static void main(String[] args) {
        Printer print = new Printer();
        Thread thread1 = new Thread(new TaskEvenOdd(print, 5, false));
        Thread thread2 = new Thread(new TaskEvenOdd(print, 5, true));
        thread1.start();
        thread2.start();
    }
}


class TaskEvenOdd implements Runnable {
    private int max;
    private Printer print;
    private boolean isEvenNumber;

    public TaskEvenOdd(Printer print, int max, boolean isEvenNumber) {
        this.print = print;
        this.max = max;
        this.isEvenNumber = isEvenNumber;
    }


    @Override
    public void run() {
        int number = isEvenNumber == true ? 2 : 1;

        while (number <= max) {

            if (isEvenNumber) {
                print.printEven(number);
            } else {
                print.printOdd(number);
            }
            number += 2;
        }
    }
}


class Printer {
    boolean isOdd = false;

    synchronized void printEven(int number) {
        while (isOdd == false) {
            try {
                wait();
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }

        }
        System.out.println("Tread Even : " + number);
        isOdd = false;
        notifyAll();
    }

    synchronized void printOdd(int number) {
        while (isOdd == true) {
            try {
                wait();
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
            }
        }
        System.out.println("Tread Odd : " + number);
        isOdd = true;
        notifyAll();
    }

}