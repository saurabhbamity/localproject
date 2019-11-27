package com.test.service;

public class SearchFlightsController extends SimpleFormController {
    private FlightService flights;

    public SearchFlightsController() {
        setCommandName("searchFlights");
        setCommandClass(SearchFlights.class);
        setFormView("beginSearch");
        setSuccessView("listFlights");
    }

    public void setFlightService(FlightService flights) {
        this.flights = flights;
    }

    @Override
    protected void initBinder(HttpServletRequest req, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd HH"), true));
    }

    @Override
    protected ModelAndView onSubmit(Object command) throws Exception {
        SearchFlights search = (SearchFlights) command;
        ModelAndView mav = new ModelAndView(getSuccessView());
        mav.addObject("flights", flights.findFlights(search));
        mav.addObject("searchFlights", search);
        return mav;
    }
}