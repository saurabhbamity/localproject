package com.test.designPattern.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class MainApp {
    
    public static void main(String[] args) {
    
        LazySingleton singleton2=null;
        LazySingleton singleton3=null;
        LazySingleton singleton4=null;
        LazySingleton singleton5=null;
        
        usingThread();
                
        LazySingleton singleton= LazySingleton.getInstance();
        System.out.println(" normal instance hashcode"+singleton.hashCode());
        
        //using clone method.
        try{
        singleton2=(LazySingleton)singleton.clone();
        }catch(CloneNotSupportedException ex)
        {
            System.out.println("exception in getting clone of lazy singleton class"+ex.getLocalizedMessage());
        }

        if (singleton2 != null) {
            System.out.println("hashcode after clone" + singleton2.hashCode());
        }
        
        //using serialization and deserialization
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonLazy.ser"));
            oos.writeObject(singleton);
            
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("singletonLazy.ser"));
            singleton3=(LazySingleton)ois.readObject();
            
        } catch (IOException|ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("hashcode after serialization"+singleton3.hashCode());
        
        //using reflection try to create an instance
        try{
        
        singleton4=(LazySingleton)Class.forName("com.test.designPattern.Singleton.LazySingleton").newInstance();
        
             
        }catch(Exception e)
        {
            System.out.println("singleton exception in reflection1"+e.getMessage());
        }
        if(singleton4!=null){
        System.out.println("hashcode after reflection1"+singleton4.hashCode());
        }
        
        try{
            
            Class<LazySingleton> clazz = LazySingleton.class;
            Constructor<LazySingleton> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            singleton5  =cons.newInstance();
            
            }catch(Exception e)
            {
                System.out.println("singleton exceotion in reflection2"+e.getMessage());
            }
        if (singleton5 != null) {
            System.out.println("hashcode after reflection2" + singleton5.hashCode());
        }
        
        
    }

    private static void usingThread() {
        
      //using multiple Thread
        
        Thread t1= new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("first Thread:"+LazySingleton.getInstance().hashCode()); 
                
            }
        });
        
        Thread t2= new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("second Thread:"+LazySingleton.getInstance().hashCode()); 
                
            }
        });
        
        Thread t3= new Thread(new Runnable() {
            
            @Override
            public void run() {
                System.out.println("Third Thread:"+LazySingleton.getInstance().hashCode()); 
            }
        });
        
        t1.start();
        t2.start();
        t3.start();
        
    }
}
