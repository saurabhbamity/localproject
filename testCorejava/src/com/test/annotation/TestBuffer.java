package com.test.annotation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestBuffer {
    
    private static final String FILENAME = "C:\\Users\\saurabh.bhardwaj\\Desktop\\test.txt";

    public static void main(String[] args) {

        BufferedReader reader = null;
        FileReader fr = null;

        try {

            //br = new BufferedReader(new FileReader(FILENAME));
            fr = new FileReader(FILENAME);
            reader = new BufferedReader(fr);
            
            //BufferedReader reader = new BufferedReader(new InputStreamReader("hjhsjhshjsjjsfjhsjjgfshgs", "utf-8"));
            StringBuilder value = new StringBuilder();
            char[] buffer = new char[10];

           /* int length = 0;
            length = reader.read(buffer);
            for (; length > 0;) {
                value.append(buffer, 0, length);
                length = reader.read(buffer);
            }*/
            
            for (int length = 0; (length = reader.read(buffer)) > 0;) {
                value.append(buffer, 0, length);
            }
            System.out.println("value new"+value);
            //String sCurrentLine;

            
           

        } catch (IOException e) {

            e.printStackTrace();

        } finally {

           
        }

    }
    
  /*  public static void main(String[] args) {
        
        
        
        BufferedReader reader = new BufferedReader(new InputStreamReader("hjhsjhshjsjjsfjhsjjgfshgs", "utf-8"));
        StringBuilder value = new StringBuilder();
        char[] buffer = new char[DEFAULT_BUFFER_SIZE];

        int length = 0;
        length = reader.read(buffer);
        for (; length > 0;) {
            value.append(buffer, 0, length);
            length = reader.read(buffer);
        }*/
    //}

}
