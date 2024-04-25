package java8features;

import java.util.List;

public class StreamMapExample {

	public static void main(String[] args) {

		
		List<Integer> values = List.of(1,2,3,4,5,6,7,8,9,10);
		
		values.stream().filter(num -> num%2==0).map(num -> num*num).forEach(System.out::println);
		
		values.stream().map(num -> num*num).forEach(System.out::println);
		
		
		
	}

}
