package day5javaprograms;

import java.util.HashSet;
import java.util.Set;

public class SetExamples {

	public static void main(String[] args) {

		
		Set<String> setObj = new HashSet<String>();
		
		setObj.add("Briyani");
		setObj.add("Noodles");
		setObj.add("Fried Rice");
		setObj.add("Pizza");
		setObj.add("Burger");
		setObj.add(null);
		
	//	System.out.println(setObj);
		
		for(String value : setObj) {
			
			
			System.out.println(value);
		}
		
	}

}
