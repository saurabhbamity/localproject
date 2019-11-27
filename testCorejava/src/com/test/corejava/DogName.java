package com.test.corejava;

import java.util.ArrayList;
import java.util.List;

public class DogName implements Cloneable {

   private String dname;
   
   private Person[] personArray= null;
   private List<Person> PersonArrayList= new ArrayList<Person>();
   
   public DogName(String dname) {
       this.dname = dname;
       Person p1= new Person(11, "firstPerson");
       Person p2= new Person(14, "SecondPerson");
       personArray= new Person[]{p1,p2};
       PersonArrayList.add(p1);
       PersonArrayList.add(p2);
      }

   public Person[] getPersonArray() {
    return personArray;
}

public void setPersonArray(Person[] personArray) {
    this.personArray = personArray;
}

public List<Person> getPersonArrayList() {
    return PersonArrayList;
}

public void setPersonArrayList(List<Person> personArrayList) {
    PersonArrayList = personArrayList;
}



   public String getName() {
	return dname;
   }
   
   public void setName(String dname) {
       this.dname=dname;
      }
   // Overriding clone() method of Object class
   public Object clone()throws CloneNotSupportedException{  
	return (DogName)super.clone();  
   }
	
   public static void main(String[] args) {
	DogName obj1 = new DogName("Tommy");
	try {
		DogName obj2 = (DogName) obj1.clone();
		System.out.println(obj2.getName()+" obj2hashcode->"+obj2.hashCode());
		System.out.println(obj1.getName()+" obj1hashcode->"+obj1.hashCode());
		
		//compare personlist
		System.out.println(obj1.getPersonArray().toString()+"  obj1hashcode->"+obj1.getPersonArray().hashCode());
		System.out.println(obj2.getPersonArray().toString()+"  obj2hashcode->"+obj2.getPersonArray().hashCode());
		
		obj1.getPersonArray()[0]= new Person(28, "ChangedPerson");
		System.out.println(obj1.getPersonArray()[0].getName()+"  obj1hashcode->"+obj1.getPersonArray()[0].hashCode());
		System.out.println(obj2.getPersonArray()[0].getName()+"  obj2hashcode->"+obj2.getPersonArray()[0].hashCode());
		
		//compare ArrayList
		obj1.getPersonArrayList().add(new Person(28, "ChangedPersonArr"));
	     System.out.println(obj1.getPersonArrayList().get(2).getName()+"  obj1hashcode->"+obj1.getPersonArrayList().get(2).hashCode());
	     System.out.println(obj2.getPersonArrayList().get(2).getName()+"  obj2hashcode->"+obj2.getPersonArrayList().get(2).hashCode());
	     
		//compare PersonArrayList
		System.out.println(obj1.getPersonArrayList().toString()+"  obj1hashcode->"+obj1.getPersonArrayList().hashCode());
        System.out.println(obj2.getPersonArrayList().toString()+"  obj2hashcode->"+obj2.getPersonArrayList().hashCode());
        
		
		obj1.setName("changedObj1");
		System.out.println(obj1.getName());
		System.out.println(obj2.getName());
	} catch (CloneNotSupportedException e) {
		e.printStackTrace();
	}
   }
}

class Person{
    
    int age;
    String name;
    
    public Person(int age, String name){
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}