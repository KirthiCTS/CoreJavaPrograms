package java8features;

import java.util.List;

public class StreamFilterExample {

	public static void main(String[] args) {

		List<String> values = List.of("Java","Javasript","Python","GoLang","Spring","Springboot");
		
		values.stream().filter(val -> val.contains("Spring")).forEach(System.out::println);
		
		values.stream().filter(val -> val.length()>=7).forEach(System.out::println);
		
	}

}
