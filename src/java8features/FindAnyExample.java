package java8features;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FindAnyExample {

	public static void main(String[] args) {

		
	IntStream stream = IntStream.of(5,6,10,13,16);
	
	stream = stream.filter(i -> i % 4 == 0);
	
	  OptionalInt intValue = stream.findAny();
		
	  if(intValue.isPresent())
		  System.out.println(intValue.getAsInt());
	  else
		  System.out.println("No occurrence");
	  
	}

}
