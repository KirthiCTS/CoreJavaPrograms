package day9javaprograms;

public class StringReverseExample {

	public static void main(String[] args) {

		
		String str = "Java", newStr = "";
		
		
		
		for(int i = str.length()-1; i>=0 ; i--) {
			
			newStr = newStr + str.charAt(i);
		//	System.out.print(str.charAt(i));
			
		}
		
		System.out.println(newStr);
		
	}

}
