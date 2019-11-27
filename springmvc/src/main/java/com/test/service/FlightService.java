package com.test.service;

import java.util.List;

import com.test.domain.Flight;
import com.test.domain.FlightSearchCriteria;
import com.test.domain.SpecialDeal;

public interface FlightService {
    List<SpecialDeal> getSpecialDeals();

    List<Flight> findFlights(FlightSearchCriteria search);
}
