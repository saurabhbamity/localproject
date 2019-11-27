package com.test.designPattern.factory2;

public class CurrencyFactoryMain {
    
    
    public static void main(String[] args) {
        
        
        Currency indianCurrency= CurrencyFactory.getInstance(CountryType.India);
        System.out.println("indian currency is "+indianCurrency.getSymble());
        
        Currency usCurrency= CurrencyFactory.getInstance(CountryType.US);
        System.out.println("indian currency is "+usCurrency.getSymble());
    }

}
