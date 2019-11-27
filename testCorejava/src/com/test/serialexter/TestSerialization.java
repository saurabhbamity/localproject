package com.test.serialexter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class NonSerializedDemo{
    
}

class Demo implements java.io.Serializable
{
    public int a;
    public String b;
    public static String c;
    public transient NonSerializedDemo non;
 
    // Default constructor
    public Demo(int a, String b, NonSerializedDemo non, String cvalue)
    {
        this.a = a;
        this.b = b;
        this.non=non;
        c=cvalue;
    }
 
}
 
public class TestSerialization
{
    public static void main(String[] args)
    {   
        Demo object = new Demo(1, "geeksforgeeks", new NonSerializedDemo(), "abc");
        String filename = "file.ser";
         
        // Serialization 
        try
        {   
            //Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
             
            // Method for serialization of object
            out.writeObject(object);
             
            out.close();
            file.close();
             
            System.out.println("Object has been serialized");
 
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
 
 
        Demo object1 = null;
 
        // Deserialization
        try
        {   
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
             
            // Method for deserialization of object
            object1 = (Demo)in.readObject();
             
            in.close();
            file.close();
             
            System.out.println("Object has been deserialized ");
            System.out.println("a = " + object1.a);
            System.out.println("b = " + object1.b);
            System.out.println("c = " + object1.c);
        }
         
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
         
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
 
    }
}