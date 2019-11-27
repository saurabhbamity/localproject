package com.test.springcore.RequiredAnnotation;

import org.springframework.beans.factory.annotation.Required;

/*
 * baby cant go without babypack, there should be check in starting.
 */
public class Baby {
    
    
    private Babypack nappy;

    public Babypack getNappy() {
        return nappy;
    }

    @Required
    public void setNappy(Babypack nappy) {
        this.nappy = nappy;
    }

}


class Babypack{
    
    private String dipperName;
    private String babyOil;
    private long babymilk;
    private int babyCloths;
    
    
    public String getDipperName() {
        return dipperName;
    }
    public void setDipperName(String dipperName) {
        this.dipperName = dipperName;
    }
    public String getBabyOil() {
        return babyOil;
    }
    public void setBabyOil(String babyOil) {
        this.babyOil = babyOil;
    }
    public long getBabymilk() {
        return babymilk;
    }
    public void setBabymilk(long babymilk) {
        this.babymilk = babymilk;
    }
    public int getBabyCloths() {
        return babyCloths;
    }
    public void setBabyCloths(int babyCloths) {
        this.babyCloths = babyCloths;
    }
}