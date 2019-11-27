package com.test.springcore.aspact;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppInventory {
    

    public static void main(String[] args) {

        
        ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
        InventoryService inventoryService= (InventoryService)ctx.getBean("inventoryservice");
        
        Inventory i= new Inventory();
        inventoryService.create(i);
        inventoryService.delete(4l);
        inventoryService.update(i);
        
        
  }

}
