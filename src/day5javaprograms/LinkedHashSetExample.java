package day5javaprograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		
		Set<String> setObj = new LinkedHashSet<String>();
		
		setObj.add("Briyani");
		setObj.add("Noodles");
		setObj.add("Fried Rice");
		setObj.add("Pizza");
		setObj.add("Burger");
		setObj.add("Burger");
		setObj.add(null);
		
	//	System.out.println(setObj);
		
		for(String value : setObj) {
			
			
			System.out.println(value);
		}

	}

}
