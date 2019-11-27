package com.test.designPattern.factory;

public class CompFactory {
    
    private  Computer comp;
    
    public Computer getInstance(String providedInstance){
        if (providedInstance.equalsIgnoreCase("pc"))
        {
            comp= new PC("PCCpu", "Pchdd", "PCProcessor");
            System.out.println(""+comp.toString());
        }
        else if (providedInstance.equalsIgnoreCase("server")){
            
            comp= new Server("CpuServer", "hddServer", "ServerProcessor");
            System.out.println(""+comp.toString());
        }
        return comp;
        
    }

}
