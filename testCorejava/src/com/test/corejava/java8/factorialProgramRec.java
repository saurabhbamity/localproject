package com.test.corejava.java8;

public class factorialProgramRec {
	
	int factorial;
	
	public static void main(String[] args) {
		
		factorialProgramRec fact= new factorialProgramRec();
		int factorial;
		
			factorial = fact.getfactorial(-5);
		
		  System.out.println("factorial is "+factorial);
	}
	
	
	
	
	public int getfactorial(int factnumber)  {
		if(factnumber==1)
		{
			return 1;
		}else if (factnumber<1) {
			return 0;
		}else{
			factorial=factnumber * getfactorial(factnumber-1);
		}
		
		return factorial;
		
	}
	
	/*TODO*/
	// by java 8 implementation
	//urinary operator
	//lamda expresssion
	//stream api.
}


interface facto{
	
	public int getfactorial(int factnumber);
	
}