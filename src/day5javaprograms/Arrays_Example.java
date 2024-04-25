package day5javaprograms;

public class Arrays_Example {

	public static void main(String[] args) {

		
		int intArray[]  = new int [5];
		intArray[0] = 100;
		intArray[1] = 200;
		intArray[2] = 300;
		intArray[3] = 400;
		intArray[4] = 500;
		
		
	//	System.out.println(intArray[2]);
	//	System.out.println(intArray[3]);
		
		int intArray2[] = {100,200,300,400,500};
		
		for(int i=0; i<intArray2.length; i++) {
			
			
			//System.out.println(intArray[i]);
			
			
			if(intArray2[i] > 200)
			{
				System.out.println(intArray2[i] + "");
			}
		}
		
		
		char [] charArr = {'c','t','s'};
		 
		
		
	}

}
