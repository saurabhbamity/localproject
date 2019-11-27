package com.test.exception;

class TestMyException extends Exception {
    
    public TestMyException(String s) throws NumberFormatException{
        super(s);
    }
    
}

class TestMyRunTimeException extends RuntimeException {
    
    public TestMyRunTimeException(String s){
        super(s);
    }
    
}

class ThrowMyException{
    
    public void m1() throws TestMyException{
       
        // first way to tackle try catch.
        
       try{
            System.out.println("throwingException try Block");
            //MyCustomException c=new MyCustomException("my custom Exception");
            throw new TestMyException("my custom Exception");
       }catch(TestMyException ex){
           System.out.println("handled exception"+ex.getLocalizedMessage());
       }
       
       // Second way to tackle Exception, if code inside throw Exception Throws that Exception 
       //from method calling this code.
       System.out.println("throwingException without try Block");
       throw new TestMyException("my custom Exception");
        
    }
    
    public void m2() throws TestMyRunTimeException{
        
       System.out.println("throwingException without try Block");
       throw new TestMyRunTimeException("my custom RunTimeException");
        
    }
}


class ThrowMyExceptionOverride{
    
    
    public void m1() throws TestMyException{
        System.out.println("overided TestMyException");
       }
    
    //@override fail it throw another Exception, may be overloaded method, but giving the same 
    //method name exactly as parent have compilation error.
    //@Override
    public void m2() throws TestMyException{
        System.out.println("Overloaded TestMyException throw Checked Exception now");
    }
    
    //compiler Error
   /* public void m2() throws TestMyRunTimeException{
        System.out.println("Overloaded TestMyException throw Checked Exception now");
    }*/
    
    
    
}

public class TestMyExceptionImpl{
    
    
    public static void main(String[] args)throws TestMyException{
        
        ThrowMyException tme= new ThrowMyException();
        tme.m1();
        tme.m2();
        
    }
    
    public static void main2(String[] args){
        
        ThrowMyExceptionOverride tme= new ThrowMyExceptionOverride();
        try{
        tme.m1();
        tme.m2();
        }catch(TestMyException ex)
        {
            System.out.println("overrided method call : catch block");
        }
    }
    
    
}
