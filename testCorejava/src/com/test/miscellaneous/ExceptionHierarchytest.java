package com.test.miscellaneous;

import java.io.FileNotFoundException;

//program is to demonstrate the if there is checked exception it must be handled on main, else it will
//throw finally throw the exception
public class ExceptionHierarchytest {
    
    public void myMethod() throws /*Exception*/RuntimeException{
        try{
            
            throw new FileNotFoundException();
            
        }finally{
            throw new NullPointerException();
        }
    }
    
    public static void main(String[] args) {
        
        ExceptionHierarchytest exceptionHierarchy= new ExceptionHierarchytest();
        System.out.println("my Exception");
        exceptionHierarchy.myMethod();
    }

}
