package com.test.corejava.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class MainDesializerImpl {
    
    
    public static void main(String[] args) {
        
        /*
         * case 1- inheritance, B Extends A, A->no serialised, B->Serialised
         */
        // Class B extends Class A, classB is serializable, and ClassA is not Serializable
        // so when B is serialised, desialised, ClassB Objects are not perserved their state.
        ClassB objectb=new ClassB();
        ClassB b2=null;
        ClassD d2=null;
        
        //child attributes
        objectb.setSerialNumber(1234567);
        objectb.setBodygaurdName("titu");
        objectb.setDepandent(false);
        
        // parent attributes that child own
        objectb.setDob(new Date());
        objectb.setId(1);
        objectb.setName("anand");
        
        
        File filename= new File("ClassB.ser");
        printObject(objectb, "before serialise");
        //serialization code
        serialization(objectb, filename);
        
        b2 = (ClassB)desialization(filename);
        printObject(b2, "after desialization");
        
        
        
        
        /*
         * case 2- inheritance, D has a  C, C->no serialised, D->Serialised
         */
        ClassD objectd= new ClassD();
        //own attributes
        objectd.setSerialNumber(1234567);
        objectd.setBodygaurdName("titu");
        objectd.setDepandent(false);
        
        // Has a  attributes that child own
        objectd.getObjectC().setDob(new Date());
        objectd.getObjectC().setId(1);
        objectd.getObjectC().setName("anand");
        
        
        
        File filename2= new File("ClassD.ser");
        printObjectd(objectd, "before serialise");
        //serialization code
        serializationd(objectd, filename2);
        
        d2 = (ClassD)desialization(filename2);
        printObjectd(d2, "after desialization");
    }

    private static Object desialization(File filename) {
        //desialization code
        Object obj=null;
        try{
        FileInputStream file = new FileInputStream(filename); 
        ObjectInputStream ois= new ObjectInputStream(file);
        obj= ois.readObject();
        }catch( IOException | ClassNotFoundException e)
        {
            System.out.println("Exception is "+e.getLocalizedMessage());
        }
        return obj;
    }

    private static void serialization(ClassB objectb, File filename) {
        try{
        FileOutputStream fis= new FileOutputStream(filename);
        ObjectOutputStream oos= new ObjectOutputStream(fis);
        oos.writeObject(objectb);
        }catch( IOException e)
        {
            System.out.println("Exception is "+e.getLocalizedMessage());
        }
    }
    
    
    
    
    

    private static void serializationd(ClassD objectd, File filename) {
        try{
        FileOutputStream fis= new FileOutputStream(filename);
        ObjectOutputStream oos= new ObjectOutputStream(fis);
        oos.writeObject(objectd);
        }catch( IOException e)
        {
            System.out.println("Exception is "+e.getLocalizedMessage());
        }
    }

    private static void printObject(ClassB b2, String msg) {
        
        System.out.println("********************************");
        System.out.println(msg+" : "+b2.getId());
        System.out.println(msg+" : "+b2.getName());
        System.out.println(msg+" : "+b2.getDob());
        System.out.println(msg+" : "+b2.getSerialNumber());
        System.out.println(msg+" : "+b2.getBodygaurdName());
        System.out.println(msg+" : "+b2.getBodygaurdName());
    }
    
    
    private static void printObjectd(ClassD d2, String msg) {
        
        System.out.println("********************************");
        System.out.println(msg+" : "+d2.getObjectC().getId());
        System.out.println(msg+" : "+d2.getObjectC().getName());
        System.out.println(msg+" : "+d2.getObjectC().getDob());
        System.out.println(msg+" : "+d2.getSerialNumber());
        System.out.println(msg+" : "+d2.getBodygaurdName());
        System.out.println(msg+" : "+d2.getBodygaurdName());
    }
}
