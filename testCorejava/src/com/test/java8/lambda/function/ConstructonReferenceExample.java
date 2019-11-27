package com.test.java8.lambda.function;

class ConstructonReferenceExample {
    
    public ConstructonReferenceExample(){
        System.out.println("this is constructor Reference Example");
    }
}

interface interf{
    
    public ConstructonReferenceExample get();
}


class test{
    public static void main(String[] args) {
    
        interf i=ConstructonReferenceExample::new;
        ConstructonReferenceExample cf=i.get();
    }
} 
