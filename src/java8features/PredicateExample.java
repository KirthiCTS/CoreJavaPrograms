package java8features;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {

		
		Predicate<Integer> lesserThan = i -> (i<20);
		
		System.out.println(lesserThan.test(10));
		
		Predicate<Integer> greaterThanTen = i -> i>10;
		
		Predicate<Integer> lesserThanTwenty = i -> i<20;
		
		
		boolean result = greaterThanTen.and(lesserThanTwenty).test(15);
		System.out.println(result);
		
		boolean result2 =  greaterThanTen.and(lesserThanTwenty).negate().test(15);
		System.out.println(result2);
		
		boolean result3 = greaterThanTen.or(lesserThanTwenty).test(15);
		System.out.println(result3);

		
	}

}
