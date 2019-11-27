package com.test.corejava.puzzle;
public class EvenOddThread implements Runnable {

	int max;
	boolean isEvenNumber;
	PrintEvenOdd print;

	public EvenOddThread(int max, boolean isEvenNumber, PrintEvenOdd print) {
		this.max = max;
		this.isEvenNumber = isEvenNumber;
		this.print = print;
	}

	@Override
	public void run() {
		int number = isEvenNumber ? 2 : 1;
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