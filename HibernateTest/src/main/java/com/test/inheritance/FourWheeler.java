package com.test.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//required only for table per class strategy.
//@DiscriminatorValue(value="VehiFourWheel")
public class FourWheeler  extends Vehicle{
    
    
    private String steeringWheelType;

    public String getSteeringWheelType() {
        return steeringWheelType;
    }

    public void setSteeringWheelType(String steeringWheelType) {
        this.steeringWheelType = steeringWheelType;
    }

}
