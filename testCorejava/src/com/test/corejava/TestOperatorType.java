package com.test.corejava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestOperatorType {
    
    String[] listing= new String[2];
    
    public static void main(String[] args) {
        
        //String carrierTypesCode= null;
        //String carrierTypesValues=null;
        TestOperatorType testOperatorType= new TestOperatorType();
       System.out.println( new TestOperatorType().EvaluateIfAllAllowedOperatorTypePresent("Air", "Air,Ship"));
       new TestOperatorType().getListOfCarrierTypeSepratedfromComma(new ArrayList<>(Arrays.asList("Air","Ship")), testOperatorType.listing); 
       
       System.out.println("carrierTypesCode"+testOperatorType.listing[0]+"carrierTypesCode");
    }
    
    public boolean EvaluateIfAllAllowedOperatorTypePresent(String carrierType, String allAllowedOperatorsTypes) {

        if (carrierType != null) {
            if (carrierType.contains(",")) {
                return true;
            } else {
                String[] carrierTypeList = carrierType.split(",");
                for (int i = 0; i < carrierTypeList.length; i++) {
                    if (!allAllowedOperatorsTypes.contains(carrierTypeList[i])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
   public void getListOfCarrierTypeSepratedfromComma(List<String> operatorTypes, String[] listing) {
        
        StringBuilder carrierTypesCodeTemp = new StringBuilder();
        StringBuilder carrierTypesValuesTemp = new StringBuilder();
        String sep = ", ";
        for (String operatorTypeElement : operatorTypes) {
            carrierTypesCodeTemp.append(sep).append(operatorTypeElement);
            carrierTypesValuesTemp.append(sep).append(operatorTypeElement);
        }
        listing[0]=carrierTypesCodeTemp.substring(1);
        listing[1]=carrierTypesValuesTemp.substring(1);
    }

}
