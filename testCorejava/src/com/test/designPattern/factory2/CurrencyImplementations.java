package com.test.designPattern.factory2;

class IndianCurrency implements Currency {

    @Override
    public String getSymble() {
        // TODO Auto-generated method stub
        return "RS";
    }

}

class USCurrency implements Currency {

    @Override
    public String getSymble() {
        // TODO Auto-generated method stub
        return "USD";
    }

}

class UkCurrency implements Currency {

    @Override
    public String getSymble() {
        // TODO Auto-generated method stub
        return "GBP";
    }

}