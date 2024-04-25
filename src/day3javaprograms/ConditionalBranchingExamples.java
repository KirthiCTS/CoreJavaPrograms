package day3javaprograms;

public class ConditionalBranchingExamples {

	public static void main(String[] args) {

		
		int i = 300;
		int j = 300;
		int k = 400;
		
		
		if(j > i && j > k) {
				
			System.out.println("J is greater");
			
		}
		
		else if(j < i || j < k) {
			
			System.out.println("J is lesser than I");
		}
		
		else if(i == j) {
			
			System.out.println("J == I");
		}
		else {
			
			System.out.println("I is greater");
		}
		
		
		
		
		
	}

}
