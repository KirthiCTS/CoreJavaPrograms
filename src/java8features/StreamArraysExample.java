package java8features;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamArraysExample {

	public static void main(String[] args) {
		
		int numArray[] = {1,2,3,4,5,6,7,8,9,10};
		
		//Max of array elements 
		
		OptionalInt maxValue = Arrays.stream(numArray).max();
		System.out.println(maxValue.getAsInt());
		
		//Min of array elemetns
		
		OptionalInt minValue = Arrays.stream(numArray).min();
		System.out.println(minValue.getAsInt());
		
		//Average 
		
		OptionalDouble averagValue = Arrays.stream(numArray).average();
		System.out.println(averagValue.getAsDouble());
		
		
		int sumValue = IntStream.range(1, 10).sum();
		System.out.println(sumValue);
		
		int sumValueClosed = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sumValueClosed);


	}

}
