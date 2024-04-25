package day8programs;

public class DuplicaElementArray {

	public static void main(String[] args) {

		int intArr [] = {1,2,3,5,6,6,7,8};
		
		for(int i=0; i<intArr.length; i++) {
			
			
			for(int j=i+1; j<intArr.length; j++) {
				
					if(intArr[i] == intArr[j]) {
						
						System.out.println("It is a duplicate elemnt: "+intArr[i]);
					}
				
			}
		}
		
	}

}
