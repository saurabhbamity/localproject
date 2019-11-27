package com.test.executorFramework;

import org.omg.CORBA.INTERNAL;

public class ParentChildThreadLocal9_1 extends Thread{
    
    static ThreadLocal<Integer> tl= new ThreadLocal<>();
    static InheritableThreadLocal<Integer> tl2= new InheritableThreadLocal() {
        
        /*
         * (non-Javadoc)
         * @see java.lang.InheritableThreadLocal#childValue(java.lang.Object)
         * override this methed gives child thread a new value (overided), 
         * else the child will get the same value as parent. 
         */
        @Override
        public Object childValue(Object parent){
            return 12;
        }
    };
    @Override
    public void run(){
        
        tl.set(5);
        
        tl2.set(11);
        System.out.println("parent Thread Thread Local value : "+tl.get());
        System.out.println("parent InheritableThreadLocal  value : "+tl2.get());
        // Child Thraed (Because creating the Thread in parent), try to get the value of parent Thread.
        
        ChildThread ct= new ChildThread();
        ct.start();
    }
    
    public static void main(String[] args) {
        ParentChildThreadLocal9_1 pt= new ParentChildThreadLocal9_1();
        pt.start();
        
        
    }
}

class ChildThread extends Thread
{
    
   public void run(){
       System.out.println("parent Thread value : "+ParentChildThreadLocal9_1.tl.get());
       
       System.out.println("parent InheritableThreadLocal value : "+ParentChildThreadLocal9_1.tl2.get());
   }


}