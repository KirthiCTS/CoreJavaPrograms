package day6javaprograms;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>();
		
		vector.add(5);
		vector.add(4);
		vector.add(3);
		vector.add(2);
		vector.add(2);
		
		vector.addElement(10);
		
		System.out.println(vector);
		
		for(int i=0; i<vector.size(); i++)
			System.out.println(vector.get(i));
		
		
		System.out.println("*** USING ENUMERATOR ***");
		
		Enumeration<Integer> obj = vector.elements();
		
		while(obj.hasMoreElements())
			System.out.println(obj.nextElement());
		
		
	}

}
