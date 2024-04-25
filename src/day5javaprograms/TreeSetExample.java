package day5javaprograms;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {

		
	Set<String> setObj = new TreeSet<String>();
		
		setObj.add("Briyani");
		setObj.add("Noodles");
		setObj.add("Fried Rice");
		setObj.add("Pizza");
		setObj.add("Burger");
		setObj.add("Burger");
		
	//	System.out.println(setObj);
		
		for(String value : setObj) {
			
			System.out.println(value);
		}


	}

}
