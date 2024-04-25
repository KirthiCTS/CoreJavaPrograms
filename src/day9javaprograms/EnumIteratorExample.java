package day9javaprograms;

public class EnumIteratorExample {

	public static void main(String[] args) {

		
		for(EnumExample values : EnumExample.values() ) {
			
			System.out.println(values);
			
		}
	}

}
