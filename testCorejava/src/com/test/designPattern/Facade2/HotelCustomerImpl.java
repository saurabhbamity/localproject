package com.test.designPattern.Facade2;

public class HotelCustomerImpl {
    
    public static HotelKeeper getMyHotelKeeper(){
        return new HotelKeeper();
    }
    
    
    // if a Hotel have three resturent and new customer is checked in in Hotel,
    // hotel customer will call the HotelKeeper to know all the manus.
    //Hotel keeper is Facade for customer, that given the intesrface to customer to get 
    //all the menus.
    public static void main(String[] args) {
        
        // now the customer will call to the roomserviceman to get the manus.
        
        
        HotelKeeper shaamu=HotelCustomerImpl.getMyHotelKeeper();
        System.out.println("veg menu : "+shaamu.getNonVegMenu());
        System.out.println("non veg Menu : "+shaamu.getNonVegMenu());
        System.out.println("Continental Menu : "+shaamu.getContinantalMenu());
        
    }

}
