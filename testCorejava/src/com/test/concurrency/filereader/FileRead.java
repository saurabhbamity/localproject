package com.test.concurrency.filereader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) {
		
		File f= new File("abc.txt");
		try {
		FileReader fr= new FileReader(f);
		int value= fr.read();
		while(value!=-1)
		{
			System.out.println((char)fr.read());
		}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
