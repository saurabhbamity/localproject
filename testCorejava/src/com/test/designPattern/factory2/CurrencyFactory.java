package com.test.designPattern.factory2;

public class CurrencyFactory {

   public static Currency getInstance(CountryType country){
       
       if(country.equals(CountryType.India))
       {
           return new IndianCurrency();
       }else if (country.equals(CountryType.UK))
       {
           return new UkCurrency();
       } else{
           return new USCurrency();
       }
       
       
       
   }

}