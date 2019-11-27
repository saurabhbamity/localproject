package com.test.domain;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

public class Flight {
    private List<FlightLeg> legs;
    private BigDecimal      totalCost;

public Flight(List<FlightLeg> legs, BigDecimal totalCost) {
//Assert.notNull(legs);
//Assert.isTrue(legs.size() >= 1, "Flights must have at least one leg");

this.legs = legs;
this.totalCost = totalCost;
}

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public boolean isNonStop() {
        return (legs.size() == 1);
    }

    public Airport getDepartFrom() {
        return getFirstLeg().getDepartFrom();
    }

    private FlightLeg getFirstLeg() {
        return legs.get(0);
    }

    private FlightLeg getLastLeg() {
        return legs.get(legs.size() - 1);
    }

    public Airport getArrivalAt() {
        return getLastLeg().getArriveAt();
    }

    public int getNumberOfLegs() {
        return legs.size();
    }

    /**
     * @return number of milliseconds for total travel time
     */
    public long getTotalTravelTime() {
        Date start = getFirstLeg().getDepartOn();
        Date end = getLastLeg().getArriveOn();
        //Assert.isTrue(end.compareTo(start) > 0, "Start date must be before end date");
        return (end.getTime() - start.getTime());
    }
}
