package com.test.executorFramework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantLock4 {
    
    public static void main(String[] args) {
        
        ReentrantLock l= new ReentrantLock();
        l.lock();
        l.lock();
        System.out.println("isLocked value:->"+l.isLocked());
        System.out.println("isHeldByCurrentThread value:"+l.isHeldByCurrentThread());
        System.out.println("getHoldCount value:"+l.getHoldCount());
        l.unlock();
        System.out.println("getHoldCount value after releasing one lock:"+l.getHoldCount());
        System.out.println("isLocked value after releasing one lock:->"+l.isLocked());
        l.unlock();
        System.out.println("isLocked value after both lock:->"+l.isLocked());
    }

}
