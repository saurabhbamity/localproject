package com.test.springcore.aspact;

import java.util.ArrayList;
import java.util.List;

public class DefaultInventoryService implements InventoryService {

    public Inventory create(Inventory inventory) {
        System.out.println("create Service method");
        Inventory inv= new Inventory();
        return inv;
    }

    public List<Inventory> list() {
        System.out.println("list method");
        List<Inventory> InvList= new ArrayList<Inventory>();
        return InvList;
    }

    public Inventory findByVin(String vin) {
        System.out.println("findByVin method");
        Inventory inv= new Inventory();
        return inv;
    }

    public Inventory update(Inventory inventory) {
        System.out.println("update Service method");
        Inventory inv= new Inventory();
        return inv;
    }

    public boolean delete(Long id) {
        System.out.println("delete method");
        Inventory inv= new Inventory();
        return true;
    }

    public Inventory compositeUpdateService(String vin, String newMake) {
        System.out.println("compositeUpdateService method");
        Inventory inv= new Inventory();
        return inv;
    }

}
