package day6javaprograms;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {

	public static void main(String[] args) {
		
		
	Hashtable<Integer, String> hmObj = new Hashtable<Integer, String>();
		
		
		hmObj.put(1, "Sachin");
		hmObj.put(2, "Rahul");
		hmObj.put(3, "Rahul");
		hmObj.put(4, "Dhoni");
		hmObj.put(5, "Ashwin");
		hmObj.put(6, "Rohit");
		hmObj.put(7, "Laxman");
		
		System.out.println(hmObj);
		
		System.out.println(hmObj.get(3));
		
		for(Map.Entry<Integer, String> entryObj : hmObj.entrySet() ) {
			
			System.out.println("Keys: "+entryObj.getKey() + "Values: "+entryObj.getValue());
			
		}
		
		System.out.println("***  USING ENUMERATION ***");
		Enumeration<Integer> keys = hmObj.keys();
		while(keys.hasMoreElements()) {
			
			int key = keys.nextElement();
			System.out.println("Key: "+key+ "Value: "+hmObj.get(key));
			
		}
				
				

		
		
		
		
	}

}
