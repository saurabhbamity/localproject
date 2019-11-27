package com.test.java8.lambda.function.methodReference;

class Sample{
    
    public Sample() {
        System.out.println("Sample constructor called");
    }
}

class SampleWithParam{
    
    public SampleWithParam(int a, int b) {
        System.out.println("Sample with param constructor called with value "+a+" value b is "+b);
    }
}

interface Interf
{
    Sample getSample();
}

interface InterfWithParam
{
    SampleWithParam getSampleWithParam(int a, int b);
}

public class TestConstructorReference11 {
    
    public static void main(String[] args) {
        
        //lamda expresion way of writting
        Interf inter= ()->{
            System.out.println("this is lamda expresion jva 8 code");
            Sample sampl= new Sample();
            return sampl;
        };
        
        Sample sam=inter.getSample();
        
        //constructor refernce will be used when lambda can be used and that lambda method definition
        // is going to return other Object type
        Interf inter2=Sample::new;
        Sample sample=inter2.getSample();
        
        // ths is the way parameterize constructor will be called in constructor reference.
        //the functional interface metod should have same numbr of the argment that return type of object required. 
        InterfWithParam interWithParam=SampleWithParam::new;
        SampleWithParam sampleParam=interWithParam.getSampleWithParam(5, 8);
        
    }

}
