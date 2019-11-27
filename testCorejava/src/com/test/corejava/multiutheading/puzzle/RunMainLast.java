package com.test.corejava.multiutheading.puzzle;


public class RunMainLast {
	
	
	public static void main(String[] args) {
		
		LocalThread run1= new LocalThread();
		LocalThread run2= new LocalThread();
		LocalThread run3= new LocalThread();
		Thread t1= new Thread(run1);
		Thread t2= new Thread(run2);
		Thread t3= new Thread(run3);
		
		
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=2;i<10;i++)
		{
			System.out.println("main Thread running the code");
		}
		
	}
	
	
	
	

}


class LocalThread implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("thead name"+ Thread.currentThread().getName()+" is executing the task");
		
	}
	
}



