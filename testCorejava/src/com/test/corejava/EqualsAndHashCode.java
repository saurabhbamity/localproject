package com.test.corejava;

public class EqualsAndHashCode {
    
    public static void main(String[] args) {
        
        Personal p= new Personal("test", "lasttest");
        Personal p3= new Personal("ram", "lasttest");
        Object p2= new Personal("test", "lasttest");
        
        //Personal with Object comparision
        System.out.println(p.equals(p2));
        
        //Personal with Personal comparision
        System.out.println(p.equals(p3));
        
        
        Personal p4= null;
        // null Object check
        System.out.println(p2.equals(p4));
        
        Parent pt = new Parent();
        //diffirent Object comparision check
        System.out.println(p.equals(pt));
        
        
    }

}
