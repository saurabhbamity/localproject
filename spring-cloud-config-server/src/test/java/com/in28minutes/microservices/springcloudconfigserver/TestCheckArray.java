package com.in28minutes.microservices.springcloudconfigserver;

import java.util.List;

public class TestCheckArray {
	
	
	public static void main(String[] args) {
		
		int[] SortedArrayList= {1,1,1,1,1,1};
		
		int oneCount=getNumberofOne(SortedArrayList);
		
		System.out.println("the number of one is "+oneCount);
	}

	private static int getNumberofOne(int[] SortedArrayList) {
		
		int lengthArray=SortedArrayList.length;
		
		boolean isOne=false;
		
		int count=0;
		
		if(lengthArray>0){
			int firstElement=SortedArrayList[0];
			count++;
			if(firstElement==0)
			{
			   isOne=false;	
			}else{
			   isOne=true;
			}
		for (int i=1;i<lengthArray;i++)
		{
			
			if(firstElement!=SortedArrayList[i])
			{
				break;
			}
			else{
				count++;
			}
			
		}
		}
		else{
			System.out.println("Empty Array");
		}
		if(isOne){
			return count;
		}else{
		   	
		   return lengthArray-count;
		}
	}

}
