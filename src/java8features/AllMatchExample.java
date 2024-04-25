package java8features;

import java.util.Arrays;
import java.util.List;

public class AllMatchExample {

	public static void main(String[] args) {

		
		List<Integer> values = Arrays.asList(3,6,9,12,16);
		
		
		boolean result = values.stream().allMatch(num -> num%3 == 0);
		System.out.println(result);
	}

}
