package day9javaprograms;

public class PalindromeExample {

	public static void main(String[] args) {

		
		String str = "madamxx";
		
		int i = 0;
		int j = str.length()-1;
		boolean flag = false;
		
		while(i < j) {
			
			if(str.charAt(i)!=str.charAt(j))
			{
				flag = false;
			}
			else {
				flag = true;
			}
			i++;
			j--;
		}
		
		if(flag)
			System.out.println("It is a palindrome");
		else
			System.out.println("It is not a palindrome");
		
		
		
	}

}
