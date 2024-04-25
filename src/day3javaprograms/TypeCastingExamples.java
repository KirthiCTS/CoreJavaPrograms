package day3javaprograms;

public class TypeCastingExamples {

	public static void main(String[] args) {

		
		String str1 = "30";
		String str2 = "40";
		String str3 = "50";
		
		
		int valueUsingParseInt = Integer.parseInt(str1);
		
		System.out.println("Using ParseInt Method: "+valueUsingParseInt);
		
		int intValue1 = Integer.valueOf(str1);
		int intValue2 = Integer.valueOf(str2);
		int intValue3 = Integer.valueOf(str3);
		
		int sum = intValue1 + intValue2 + intValue3;
		
		System.out.println(sum);
		
		String strValue = String.valueOf(sum);
		System.out.println(strValue);
		
		
		
		
		
	}

}
