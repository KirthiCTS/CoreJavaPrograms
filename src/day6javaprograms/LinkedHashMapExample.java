package day6javaprograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {

	LinkedHashMap<Integer, String> hmObj = new LinkedHashMap<Integer, String>();
		
		hmObj.put(7, "Laxman");
		hmObj.put(1, "Sachin");
		hmObj.put(2, "Rahul");
		hmObj.put(3, "Rahul");
		hmObj.put(4, "Dhoni");
		hmObj.put(5, "Ashwin");
		hmObj.put(6, "Rohit");
		hmObj.put(null, "Rohit");
		hmObj.put(null, null);
		hmObj.put(9, null);
		
		System.out.println(hmObj);
		
		System.out.println(hmObj.get(3));
		
		for(Map.Entry<Integer, String> entryObj : hmObj.entrySet() ) {
			
			System.out.println("Keys: "+entryObj.getKey() + "Values: "+entryObj.getValue());
			
		}

	}

}
