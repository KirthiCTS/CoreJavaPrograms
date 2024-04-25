package day9javaprograms;

import java.util.Arrays;
import java.util.Collections;

public class AnagramExample {

	public static void main(String[] args) {

		
		String str1 = "file";
		String str2 = "live";
		boolean returnValue = false;
		
		
		if(str1.length() == str2.length()) {
			
			
			char [] charArrString1 = str1.toCharArray();
			char [] charArrString2 = str2.toCharArray();
			
			System.out.println(charArrString1);
			System.out.println(charArrString2);
			
			Arrays.sort(charArrString1);
			Arrays.sort(charArrString2);
			
			returnValue = Arrays.equals(charArrString1, charArrString2);
			if(returnValue)
				System.out.println("This is an anagram");
			else
				System.out.println("This is not an anagram");
				
			
			
		}
		else {
			
			System.out.println("This cannot be an anagram");
			
		}
		
	}

}
