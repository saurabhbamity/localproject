package com.test.pattern;

public class TestRegex {

    public static void main(String[] args) {
        
        String s="12347654.090";
        System.out.println(s.matches("^-?\\d{1,8}\\.\\d{3}$"));

    }

}
