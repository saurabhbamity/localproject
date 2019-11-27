package com.test.corejava;

import java.awt.image.SampleModel;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class testDate {
	
	public static void main(String[] args) {
		
		Calendar cdate= Calendar.getInstance();
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date sdate= new Date();
		System.out.println("cdate:->" +cdate);
		System.out.println("sdate:->" +sdate);
		System.out.println("util date:->"+new Date(sdf.format(sdate)));
		System.out.println("cal format:->"+sdf.format(sdate.getTime()));
		
		String REGEX_FOR_DATE   = "^\\d{4}\\-\\d{2}\\-\\d{2}$";
		String firstdate="2015/07/22";
		String seconddate="22/7/2015";
		String thirddate="22-07-2415";
		String date4="2415-22-09";
		System.out.println("1"+firstdate.matches(REGEX_FOR_DATE));
		System.out.println("2"+seconddate.matches(REGEX_FOR_DATE));
		System.out.println("3"+thirddate.matches(REGEX_FOR_DATE));
		System.out.println("4"+date4.matches(REGEX_FOR_DATE));
		//System.out.println(null);
		
	}
	
	public void abc(List<Integer> t)
	{
	    System.out.println("list integer");
	}
	
	public void abc(String t1)
    {
        System.out.println("list String");
    }

}
