package com.test.springcore.resoucebundle;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResourceMain {
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        /* Get default locale. */
        Locale defaultLocale = Locale.getDefault();
        
        String messagetestvalueus = context.getMessage("testing.value", null, Locale.US);
        String messagetestvaluejp = context.getMessage("testing.value", null, Locale.JAPAN);
        String messagetestvalue = context.getMessage("testing.value", null,defaultLocale);
        
        
        String paramsArray[] = {"saurabh","HELLO WORLD"};
        String messagegreetingvalueus = context.getMessage("greeting.msg",paramsArray, null, Locale.US);
        String messagegreetingvaluejp = context.getMessage("greeting.msg",paramsArray, null, Locale.JAPAN);
        String messagegreetingvalue = context.getMessage("greeting.msg",paramsArray, null,defaultLocale);
        
        
        System.out.println(messagetestvalue);
        System.out.println(messagetestvalueus);
        System.out.println(messagetestvaluejp);
        
        System.out.println(messagegreetingvalue);
        System.out.println(messagegreetingvalueus);
        System.out.println(messagegreetingvaluejp);
        
    }

}
