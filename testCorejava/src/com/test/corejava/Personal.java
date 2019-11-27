package com.test.corejava;

public class Personal {
    
    private String name;
    private int id;
    private String lName;
    
    public Personal(String name, String lname)
    {
        this.name=name;
        this.lName=lname;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        }else if (o == null) {
            return false;
        } /*else if (o.getClass() != this.getClass()) {
            return false;
        }*/else if (o instanceof Personal){
            Personal p= (Personal)o;
            return (p.name!=null && p.name==this.name) && (p.lName!=null && p.lName==this.lName);
        }else{
            return false;
        }
    }
    
    @Override
    public int hashCode()
    {
       int primeNumber=31;
       return primeNumber*(this.name.hashCode() +lName.hashCode());
    }
}
