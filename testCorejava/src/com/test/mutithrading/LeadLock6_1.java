package com.test.mutithrading;

public class LeadLock6_1 {

    public static void main(String[] args) {
        
        System.out.println("before try catch block");
        try {
            System.out.println("entring in lead lock");
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
