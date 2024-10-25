package com.in28minutes.java.threads;

class Calculator extends Thread {
	long sum;

	public void run() {
		System.out.println("Before Run");
		synchronized (this) {
			for (int i = 0; i < 1000000; i++) {
				sum += i;//499999500000
			}
			notify();
		}
		System.out.println("After Run");
	}
}

public class ThreadWaitAndNotify {
	public static void main(String[] args) {
		Calculator thread = new Calculator();
		thread.start();
		synchronized (thread) {
			try {
				System.out.println("Before Wait");
				thread.wait();
				System.out.println("After Wait");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(thread.sum);
	}
}
