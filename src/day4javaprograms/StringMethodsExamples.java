package day4javaprograms;

public class StringMethodsExamples {

	public static void main(String[] args) {

		
		String str1 = "Java";
		String str2 = "Java1";
		
		if(str1.equals(str2))
			System.out.println("Equals");
		else
			System.out.println("Not Equals");
		
		
		StringBuilder sBuilder1 = new StringBuilder("Java");
		StringBuilder sBuilder2 = new StringBuilder("Java1");
		
		if(sBuilder1.equals(sBuilder2))
			System.out.println("Equals for StringBuilder");
		else
			System.out.println("Not Equals for StringBuilder");
		
		StringBuffer sbuffer1 = new StringBuffer("Java");
		StringBuffer sbuffer2 = new StringBuffer("Java1");
		
		if(sbuffer1.equals(sbuffer2))
			System.out.println("Equals for StringBuffer");
		else
			System.out.println("Not Equals for StringBuffer");
		
		
		
		System.out.println(sBuilder1.compareTo(sBuilder2));
		System.out.println(sbuffer1.compareTo(sbuffer2));
		
		
		
		
		if(str1.contentEquals(sbuffer1))
			System.out.println("Using Content Equals Method: True");
		else
			System.out.println("Using Content Equals Method: False");
		
		
		
		if(str1.contentEquals(sBuilder1))
			System.out.println("Using Content Equals for SBuilder Method: True");
		else
			System.out.println("Using Content Equals for SBuilder Method: False");
		
		
		if(str1.contains("Java Programming Language"))
			System.out.println("Using Contains for String comparison: True");	
		else
			System.out.println("Using Contains for String comparison: False");	
			
		
		StringBuffer reversValue = new StringBuffer("Java");
		reversValue.reverse();
		System.out.println("Reversing a value: "+reversValue);
		
	}

}
