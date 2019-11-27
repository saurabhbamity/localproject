package com.test.designPattern.FlyingWeight;

public class FlyweightImpl {

    public static void main(String[] args) {
        
        for (int i=10001;i<10030;i++)
        {
            int j=1009 ;
            int inti=(int)Math.round(j*Math.random());
            Person man= PersonFactory.CreatePersonFactory((int)Math.round(i*(Math.random()))%15, i*8%19, "name"+i);
        }

    }

}
