package com.test.inheritance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity

@Inheritance(strategy=InheritanceType.JOINED)
/*required only for table per class strategy.
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)*/
/*required only for table per class strategy.
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="vehicleType", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="Vehi")*/
public class Vehicle {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int vehicle_id;
    
    private String vehicle_name;

    public int getVehicle_id() {
        return vehicle_id;
    }

    public void setVehicle_id(int vehicle_id) {
        this.vehicle_id = vehicle_id;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public void setVehicle_name(String vehicle_name) {
        this.vehicle_name = vehicle_name;
    }

}
