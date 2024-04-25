package java8features;

import java.util.List;

public class MethodReference {

	public static void main(String[] args) {

		List<String> values = List.of("Java","Javasript","Python","GoLang","Spring","Springboot");
		values.stream().map(String::toUpperCase).forEach(System.out::println);
		
	}

}
