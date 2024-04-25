package java8features;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
	public static void main(String[] args) {

	
		System.out.println(unaryOperator.apply(5));
		
		
	}

}
