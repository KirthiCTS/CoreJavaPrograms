package day6javaprograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {

		
		HashMap<Integer, String> hmObj = new HashMap<Integer, String>();
		
		
		hmObj.put(7, "Laxman");
		hmObj.put(1, "Sachin");
		hmObj.put(2, "Rahul");
		hmObj.put(3, "Rahul");
		hmObj.put(4, null);
		hmObj.put(5, null);
		hmObj.put(6, "Rohit");
		
		System.out.println(hmObj);
		
		System.out.println(hmObj.get(3));
		
		for(Map.Entry<Integer, String> entryObj : hmObj.entrySet() ) {
			
			System.out.println("Keys: "+entryObj.getKey() + "Values: "+entryObj.getValue());
			
		}
		
		Iterator <Integer> it = hmObj.keySet().iterator();  
		
		while(it.hasNext())
		{
			
			int key = it.next();
			
			System.out.println("Key: "+key+"     Value: "+hmObj.get(key)); 			
		}
		
		
		
		
		
		
	}

}
