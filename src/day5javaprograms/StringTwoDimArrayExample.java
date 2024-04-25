package day5javaprograms;

public class StringTwoDimArrayExample {

	public static void main(String[] args) {

		
		String [][] strArr = {{"Java", "Python"},
							  {"JSON", "XML", "TEXT"},
							  {"HTML", "ANGULARJS","REACTJS"}
							};
		
			for(int i=0; i<strArr.length ; i++) {
				
				for(int j=0; j< strArr[i].length; j++ ) {
					
						System.out.println(strArr[i][j] + " ");
					
				}
				System.out.println();
				
				
				
		
		}
		
		
	}

}
