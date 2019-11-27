package com.test.puzzle;

import java.util.ArrayList;
import java.util.List;

public class palendrome {
    
    
    public static void main(String[] args) {
        
        System.out.println("babab "+isPal("babab"));
        System.out.println("babasb "+isPal("babasb"));
    }
    
    public static void scanString(String str)
    {
        for(int i=1;i<str.length();i++)
        {
            List<String> lst= new ArrayList<>();
            isPal(str.substring(),)
            
        }
    }
    
    public static boolean isPal(String s) {

        if(s.length() == 0 || s.length() == 1)
            // if length =0 OR 1 then it is
            return true; 
        if(s.charAt(0) == s.charAt(s.length()-1))
            // check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
            return isPal(s.substring(1, s.length()-1));

        // if its not the case than string is not.
        return false;
    }

}
