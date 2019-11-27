package com.test.java8.jodaDatetime;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.sun.jmx.snmp.Timestamp;

public class JodaDateTimeExample {
    
    public static void main(String[] args) {
        
        //java7
        Date dt = new Date();
        System.out.println("date java 7 is:  "+dt.toString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String date = sdf.format(dt); 
        System.out.println("dd/M/yyyy formate: "+date); 
        
        //using Calender java 7
        Calendar calendar = Calendar.getInstance();
        Date dat =  calendar.getTime();
        System.out.println("calender date java7 : "+dat.toString());
        
        // get day of week and all java7 
        Calendar gcalendar = new GregorianCalendar(2013,1,28,13,24,56);

        int year       = gcalendar.get(Calendar.YEAR);
        int month      = gcalendar.get(Calendar.MONTH); // Jan = 0, dec = 11
        int dayOfMonth = gcalendar.get(Calendar.DAY_OF_MONTH); 
        int dayOfWeek  = gcalendar.get(Calendar.DAY_OF_WEEK);
        int weekOfYear = gcalendar.get(Calendar.WEEK_OF_YEAR);
        int weekOfMonth= gcalendar.get(Calendar.WEEK_OF_MONTH);

        int hour       = gcalendar.get(Calendar.HOUR);        // 12 hour clock
        int hourOfDay  = gcalendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
        int minute     = gcalendar.get(Calendar.MINUTE);
        int second     = gcalendar.get(Calendar.SECOND);
        int millisecond= gcalendar.get(Calendar.MILLISECOND);
            
        System.out.println(sdf.format(gcalendar.getTime()));
            
        System.out.println("year \t\t: " + year);
        System.out.println("month \t\t: " + month);
        System.out.println("dayOfMonth \t: " + dayOfMonth);
        System.out.println("dayOfWeek \t: " + dayOfWeek);
        System.out.println("weekOfYear \t: " + weekOfYear);
        System.out.println("weekOfMonth \t: " + weekOfMonth);
            
        System.out.println("hour \t\t: " + hour);
        System.out.println("hourOfDay \t: " + hourOfDay);
        System.out.println("minute \t\t: " + minute);
        System.out.println("second \t\t: " + second);
        System.out.println("millisecond \t: " + millisecond);
        
        //timestemp in java7
        
        //method 1
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println("timestemp java7 "+timestamp);

        //method 2 - via Date
       
        System.out.println("timestepm java 7: "+new Timestamp(dt.getTime()));
        
        //java8
        System.out.println("*********************************JAVA8******************************");
        
        //local date Creation 
        LocalDate today = LocalDate.now();
        System.out.println(today.toString());
        
        int d = today.getDayOfMonth(); 
        System.out.println("day"+d);
    }

}
