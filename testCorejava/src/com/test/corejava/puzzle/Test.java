package com.test.corejava.puzzle;

public class Test {

	public static void main(String[] args) {
/*		
          Printer print = new Printer(); 
		  Thread t1 = new Thread(new TaskEvenOdd(10, print, false),"Odd"); 
		  Thread t2 = new Thread(new TaskEvenOdd(10, print, true),"Even"); 
		  t1.start(); 
		  t2.start();
		  */

		PrintEvenOdd print1 = new PrintEvenOdd();
		Thread t3 = new Thread(new EvenOddThread(10, false, print1), "odd");
		Thread t4 = new Thread(new EvenOddThread(10, true, print1), "even");
		t3.start();
		t4.start();
		
	}

}
