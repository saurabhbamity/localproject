package com.test.corejava;

public class TestBoolean {
	
	public static void main(String[] args) {
		
		int i=0, j=9,k=8;
		boolean l=(i==8) || (j==9)  && (k==8) ;
		System.out.println("value"+l);
		
		new TestingStaticClass().methodA();
		TestingStaticClass.methodB();
		String teststring="Ibri Passports And  Residence NOC Cashier, Muscat Seaport Mina Qaboos, Muscat International Airport Royal Flight Arrivals, Muscat International Airport Royal Flight Departures, Muscat Passports   Residence Statistics Arrivals, Muscat Passports   Residence Statistics Departures, Salalah Passports   Residence NOC Arrivals, Salalah Passports   Residence NOC Departures, Buraimi Border crossing Mezyad Arrivals, Buraimi Border crossing Mezyad Departures";
		System.out.println("string ->"+teststring);
		System.out.println("string replace->"+teststring.replace(",", "<br>"));
		
	}

}

class TestingStaticClass
{
    public void methodA()
    {
        System.out.println("method inside StaticClass: Method A");
    }
    
    public static void methodB()
    {
        System.out.println("method inside StaticClass: Method B");
    }
}
