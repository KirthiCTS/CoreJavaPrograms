package day9javaprograms;

public class MinValue {

	public static void main(String[] args) {

		int arr[] = {20,1000,50,10,1,65,750};
		
		int minValue = arr[0];
		
		for(int i = 1; i< arr.length ; i++) {
			
			
			if(arr[i] < minValue) {
				
				
				minValue = arr[i];
				
			}
		}
		
		System.out.println("Minimum value is: "+minValue);

	}

}
