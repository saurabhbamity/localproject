package com.test.corejava.staticImport;

import static com.test.corejava.staticImport.A.TEST_STRING;

//import static com.test.corejava.staticImport.B.TEST_STRING;

public class TestStaticImport {
    
    public static void main(String[] args) {
        
        System.out.println("calss A static Inport TEST_STRING is:-> "+TEST_STRING);
        
        System.out.println("calss B static Inport TEST_STRING is;-> "+B.TEST_STRING);
    }
    

}


class A{
    
    public static final String TEST_STRING="test String";
    
}

class B{
    
    public static final String TEST_STRING="test String";
    
}
