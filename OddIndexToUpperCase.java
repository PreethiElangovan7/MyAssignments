package week2.day1;

import java.lang.Character;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i=i+2) {
			//if(i%2!=0 && ch[i]%2==0)
			if(i%2!=0);
			{
			 char uppercase = Character.toUpperCase(ch[i]);
				System.out.println(uppercase);
			}
			
			
			
		}

	}

}
