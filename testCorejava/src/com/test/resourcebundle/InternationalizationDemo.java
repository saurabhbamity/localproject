package com.test.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;
public class InternationalizationDemo {
public static void main(String[] args) {

ResourceBundle bundle = ResourceBundle.getBundle("com.test.resourcebundle.MessageBundle", Locale.US);
System.out.println("Message in " + Locale.US + ": " + bundle.getString("greeting"));

//changing the default locale to indonasian 
Locale.setDefault(new Locale("in", "ID"));
bundle = ResourceBundle.getBundle("com.test.resourcebundle.MessageBundle");
System.out.println("Message in " + Locale.getDefault() + ": " + bundle.getString("greeting"));

}
}