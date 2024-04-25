package day4javaprograms;

public class StringSplitExample {

	public static void main(String[] args) {

		
		String splitStrings = "Java, Programming, Training";
		
		String [] splitValues = splitStrings.split(",");
		
		System.out.println(splitValues[2]);
		System.out.println(splitValues[0]);
		
	//	System.out.println(splitValues[4]);
		
		String replacedValue = splitStrings.replace(",","").replace("\s","");
		System.out.println(replacedValue);
	}

}
