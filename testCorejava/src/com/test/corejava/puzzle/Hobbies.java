package com.test.corejava.puzzle;
import java.util.*;

public class Hobbies {
    
    private final HashMap<String, String[]> hobbies = new HashMap<String, String[]>();
    
    public void add(String hobbyist, String... hobbies) {
        this.hobbies.put(hobbyist, hobbies);
    }
    
    public List<String> findHobbyists(String hobby) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        List<String> namesofperson=new ArrayList<String>();
        for (Map.Entry<String, String[]> entry : hobbies.entrySet()) {
        {
            //String[] hobbiesValue= hobbies.get(i);
            boolean isfound=findvalue(entry.getValue(),hobby);
            if(isfound)
            {
                namesofperson.add(entry.getKey().toString());
            }
        }
        }
        return namesofperson;
    }
    
    private boolean findvalue(String[] value, String hobby) {
        
        boolean isfound=false;
        for (int i=0;i<value.length;i++)
        {
            if(value[i].equals(hobby))
            {
                isfound=true;
            }
        }
        return isfound;
    }

    public static void main(String[] args) {
        Hobbies hobbies = new Hobbies();
        hobbies.add("John", "Piano", "Puzzles", "Yoga");
        hobbies.add("Adam", "Drama", "Fashion", "Pets");
        hobbies.add("Mary", "Magic", "Pets", "Reading");
        
        System.out.println(Arrays.toString(hobbies.findHobbyists("Yoga").toArray()));
    }
}