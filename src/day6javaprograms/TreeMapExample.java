package day6javaprograms;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		
		


		Map<Integer, String> hmObj = new TreeMap<Integer, String>();
			
		
			hmObj.put(7, "Sachin");
			hmObj.put(1, "Sachin");
			hmObj.put(2, "Rahul");
			hmObj.put(3, "Rahul");
			hmObj.put(4, "Dhoni");
			hmObj.put(6, "Ashwin");
			hmObj.put(6, null);
			
			System.out.println(hmObj);
			
			System.out.println(hmObj.get(3));
			
			for(Map.Entry<Integer, String> entryObj : hmObj.entrySet() ) {
				
				System.out.println("Keys: "+entryObj.getKey() + "Values: "+entryObj.getValue());
				
			}

		
		
	}

}
