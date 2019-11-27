package com.test.java8.lambda.function;

import java.util.Date;
import java.util.function.Supplier;

public class SuplierExample7 {
    
    /*
     * predicate-> boolean->test
     * Function<T,R>-> R Type->apply
     * consumer<T>-> void->accept
     * Supplier<T>->no input, T is output-> get
     */
    public static void main(String[] args) {
        
        Supplier<Date> sup=()->new Date();
        System.out.println(sup.get());
        System.out.println(sup.get());
        System.out.println(sup.get());
        
        //suplier to get OTP with 6 digit
        
        Supplier<String> OTPSuplier=()->{
            String OTP="";
            for (int i=1;i<=6;i++)
            {
                OTP= OTP+(int)(Math.random()*10);
            }
            return OTP;
        };
        System.out.println("ramdam number: "+OTPSuplier.get());
        System.out.println("ramdam number: "+OTPSuplier.get());
    }
    

}
