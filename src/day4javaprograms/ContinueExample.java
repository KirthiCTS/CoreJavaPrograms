package day4javaprograms;

public class ContinueExample {

	public static void main(String[] args) {

		
		
		for(int i=0; i<=10; i++) {
			
			if(i > 4 && i < 9)
			{
				continue;
			}
			
			System.out.println(i);
			
		}
		
		for(int i=0; i<=10; i++) {
			
			 if(i==5)
				 break;
			 
			 System.out.println("Using Break: "+i);
			
		}
		
	}

}
