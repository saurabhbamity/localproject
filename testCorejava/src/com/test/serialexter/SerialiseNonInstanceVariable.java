package com.test.serialexter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerialiseNonInstanceVariable {

    public static void main(String[] args) {

        FileInputStream fis=null;
        ObjectInputStream ois=null;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;

        try {
            Serialized sz=new Serialized(); 
            
            fos= new FileOutputStream("abc.ser");
            oos= new ObjectOutputStream(fos);
            oos.writeObject(oos);
            
            
            fis = new FileInputStream("abc.ser");
            ois = new ObjectInputStream(fis);
            Serialized s2=(Serialized) ois.readObject();
            

        } catch (Exception e) {
            System.out.println("" + e);
        } finally {
            try {
                fis.close();
                ois.close();
                oos.close();
                fos.close();
            } catch (Exception e) {
            }

        }

    }

}

class NonSerialise {
    
    int j;
    public NonSerialise(){
        j=6;
    }
    
    @Override
    public String toString(){
        
        return "j value is : "+this.j;
    }
    
}

class Serialized implements Serializable {

    public transient NonSerialise nonserialise;

    private int          i;

    public Serialized() {

        i = 10;
        nonserialise = new NonSerialise();

    }
    @Override
    public String toString(){
        
        return "i value is : "+this.i+"NonSerialise object is : " + this.nonserialise.toString();
    }
}
