package com.test.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainSerializationImpl {
    
    public static void main(String[] args) {
        
        User object= new User("saurabh", "bhardwaj", 12356, "XXXXX");
        String filename = "users1.ser"; 
        
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
  
        }  catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        }
        
        //update static variable value
        object.setAccountNumber(54321);
        object.setAccountNumber(0);
        
        
        User object1 = null; 
        
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream(filename); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            object1 = (User)in.readObject(); 
              
            in.close(); 
            file.close(); 
              
            System.out.println("Object has been deserialized "); 
            System.out.println("first name = " + object1.getFirstName()); 
            System.out.println("last name = " + object1.getLastName()); 
            System.out.println("account Number = " + object1.getAccountNumber()); 
            System.out.println("password = " + object1.getPassword());
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
