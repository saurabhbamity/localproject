package com.test.corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class testingDate {
    
    public static void main(String[] args) {
        
        try{
        Date dob = null;
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dob = df.parse("1941-09-30 23:10:08");
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(dob);
        XMLGregorianCalendar xmlDate3 = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH)+1, cal.get(Calendar.DAY_OF_MONTH),dob.getHours(),dob.getMinutes(),dob.getSeconds(),DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);
        System.out.println(xmlDate3);
        }catch(Exception e)
        {
            System.out.println("abc");
        }
    }

    protected void gettest() throws ClassNotFoundException{
        
    }
}


class A extends testingDate{
    
    @Override
    protected void gettest() {
        
    }
}