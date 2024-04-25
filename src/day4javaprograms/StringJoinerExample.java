package day4javaprograms;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {

		
		
		StringJoiner stringJoiner = new StringJoiner("#");
		
		stringJoiner.add("Java").add("Programming").add("Course");
		
		System.out.println("Joined Strings: "+stringJoiner);
		
		StringJoiner stringJoiner2 = new StringJoiner("#");
		
		stringJoiner2.add("Python").add("Programming").add("Course");
		
		StringJoiner mergedStrings = stringJoiner.merge(stringJoiner2);
		
		System.out.println(mergedStrings);
		
		
	}

}
