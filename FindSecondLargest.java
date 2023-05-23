package week2.day1;

import java.util.Arrays;

public class FindSecondLargest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		int sec_largest = data[data.length-2];
		System.out.println(sec_largest);

	}	        
	
}
		   
		
		
		    
		  
		 
		

	


