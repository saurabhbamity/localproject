package com.test.designPattern.Singleton;

import java.io.Serializable;

public final class LazySingleton implements Cloneable,Serializable {

    /**
     * {@link Serializable} 
     */
    private static final long serialVersionUID = 600132929804691630L;
    
    private static volatile LazySingleton instance = null;

    private LazySingleton() {
        //created to restrict the create new instance from reflection. 
        System.out.println("someone tried to create a instance of this singleton using reflection");
        if(instance!=null){
            throw new RuntimeException("Its Singleton Class use getInstance method for object creation");
        }
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                //this check is avoiding race condition, where on line 23, two thead t1, and t2 having checked these instance variable as null, and t1 
                //get the lock and t2 is waiting, if again line 28 null check will not happen(where instance is volatile) t2 could have also creatd 
                //instance again, so checking in instalce again.
                if (instance == null) {
                    instance = new LazySingleton();
                }

            }
        }
        return instance;
    }
    
    /**
     * created to restrict the clone method to to create instance.
     * */
    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }
    
    /**
     * created to restrict the deserialize method to to create instance, read resolve works after to 
     * replace the object return from objectInputSteam.
     * */
    //@Override
    public Object readResolve() {
            System.out.println("Executing readResolve");
            return instance;
    }
    
    

}
