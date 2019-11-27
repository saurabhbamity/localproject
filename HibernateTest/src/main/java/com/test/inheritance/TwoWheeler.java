package com.test.inheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//required only for table per class strategy.
//@DiscriminatorValue(value="VehiTwoWheel")
public class TwoWheeler extends Vehicle {
    
    
    private String steeringHandleType;

    public String getSteeringHandleType() {
        return steeringHandleType;
    }

    public void setSteeringHandleType(String steeringHandleType) {
        this.steeringHandleType = steeringHandleType;
    }

}
