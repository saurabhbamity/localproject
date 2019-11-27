package com.test.overriding;

import java.io.IOException;

class ExceptionOverrideA {

    public void add(int i) throws IOException
    {
        System.out.println("A called");
    }
}

class ExceptionOverrideB extends ExceptionOverrideA {

    public void add(int i)
    {
        System.out.println("B called");
    }
}
