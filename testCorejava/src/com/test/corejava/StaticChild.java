package com.test.corejava;

public class StaticChild extends StaticParent{
    
    
        
        public static void abc()
        {
            System.out.println("Static Child");
        }

    public static void main(String[] args) {
       StaticParent pc= new StaticChild();
       StaticChild c= new StaticChild();
       StaticParent p= new StaticParent();
       pc.abc();
       p.abc();
       c.abc();
       abc();
    }

}
