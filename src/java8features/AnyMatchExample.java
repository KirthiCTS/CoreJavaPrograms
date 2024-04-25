package java8features;

import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {

		
		List<String> values = List.of("Java","Python","Spring","Springboot");
		
		boolean returnValue = values.stream().anyMatch(val -> val.contains("C++"));
		
		System.out.println(returnValue);
	}

}
