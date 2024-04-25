package day5javaprograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		List <String> listObj = null;
		
		
		listObj = new ArrayList<String>();
		
		listObj.add("Sachin");
		listObj.add("Dhoni");
		listObj.add("Kohli");
		listObj.add("Ashwin");
		listObj.add("Rohit");
		listObj.add("Rohit");
		listObj.add(null);
		
		
	//	System.out.println(listObj);
		
	//	System.out.println(listObj.get(2));
		
		for(int i=0; i<listObj.size(); i++) {
			
			System.out.println(listObj.get(i));
			
			
		}
	}

}
