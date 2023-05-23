package week2.day1;

import java.util.Arrays;

public class ReversEvenwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] test1 = test.split(" ");
		String val = "";
		for (int i = 0; i < test1.length; i++) {

		    if (i % 2 == 1)
		        val = val + new StringBuilder(test1[i]).reverse().toString() + " ";
		    else
		        val = val + test1[i] + " ";
		}
		val = val.trim();
		System.out.println(val);
		
			
		}

	

}
