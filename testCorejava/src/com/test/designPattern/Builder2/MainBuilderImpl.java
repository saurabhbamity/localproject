package com.test.designPattern.Builder2;

import java.util.ArrayList;
import java.util.List;

public class MainBuilderImpl {

    
    public static void main(String[] args) {
        
        List<FruitKind> fruitList= new ArrayList<FruitKind>();
        fruitList.add(FruitKind.APPLE);
        fruitList.add(FruitKind.BANANA);
        fruitList.add(FruitKind.PINNAPLE);
        cake eggCake=new cake.Builder().size(10).weight(500).eggible(false).addFuitquantity(250).
                fruitList(fruitList)
                .build();
        
        System.out.println(eggCake.toString());
        System.out.println(eggCake.getFuitquantity());
    }
}
