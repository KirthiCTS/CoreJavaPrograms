package day8programs;

import java.util.Arrays;

public class BubbleSortExample {

	public static void main(String[] args) {

		int arr [] = {3,1,2,5,4,7,6};
		
		
		Arrays.sort(arr);
		
		for(int i : arr) {
			
			System.out.println(i);
		}
		
	/*	for (int i=0; i<arr.length; i++) {
			
			
			for(int j = i+1; j<arr.length; j++) {
				
				
					if(arr[i] > arr[j] )
					{
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						
					}
				
				
			}
			
			System.out.println("Sorted:"+Arrays.toString(arr));
			*/
			
			
		}
		
		
	}

