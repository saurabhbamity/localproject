package com.test.corejava.puzzle;


/*
 * write a program to sort a array of integer in 1 loop.
 */
public class SortArrayInOnceLoop {

    public static void main(String[] args) {

        int[] arr = {100, 110, 111, 1, 3, 19, 1, 11, -10};
        System.out.println(arr.toString());
        for(int k=0;k<arr.length;k++)
        {
            System.out.println("value: "+arr[k]);
        }
        for(int i = 0, j=i+1; i < arr.length && j<arr.length;)
        {       
            if(arr[i] > arr[j])
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;              
                i=0;
                j=i+1;
            } 
            else
            {
                i++;
                j++;
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.println("value changes: ->"+arr[k]);
        }

    }

}
