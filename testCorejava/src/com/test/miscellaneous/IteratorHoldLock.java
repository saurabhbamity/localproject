package com.test.miscellaneous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**program to test it once the Iterator is taken , can we add the list in Arraylist*/
public class IteratorHoldLock {

    public static void main(String[] args) {
        
       List names=new ArrayList<>();
        names.add("saurabh");
        names.add("raj");
        ListIterator<String> itr=names.listIterator();
        //Iterator<String> itr=names.iterator();
        /*itr.add("saurabh2");
        itr.add("raj2");*/
        names.add("saurabh2");
        names.add("saurabh3");
        while(itr.hasNext())
        {
            System.out.println("String s= "+itr.next());
        }
        

        
        /*String[] s = {"Hi", "I", "am", "saurabh"};

        ArrayList<String> list = new ArrayList();
        ListIterator<String> listIterator = list.listIterator();

        for (int i = 0; i < s.length; ++i) {
            System.out.println(s[i]);
            listIterator.add(s[i]);
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
*/
        //System.out.println(listIterator.next());

    }

}
