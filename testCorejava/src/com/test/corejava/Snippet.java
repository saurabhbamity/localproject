package com.test.corejava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.time.DateUtils;

public class Snippet {
    
    
    public static void main(String[] args) {
        try {
            Date date = DateUtils.parseDate("2015-07-27",new String[]{"yyyy-MM-dd"});
            SimpleDateFormat sdfAr = new SimpleDateFormat("dd-MM-yyyy");
            String dob = sdfAr.format(date);
            System.out.println("dob"+dob);
        } catch (ParseException e) {
            e.getMessage();
        }
        
    }
     
}

