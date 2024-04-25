package day4javaprograms;

public class StringConcat {

	public static void main(String[] args) {

		
		String str = "Java";
		str = str.concat("Programming");
		
		System.out.println(str);
		
		StringBuffer sbuffer = new StringBuffer("Java");
		sbuffer.append("Programming");
		
		System.out.println(sbuffer);
		
		StringBuilder sbuilder = new StringBuilder("Java");
		sbuilder.append("Programming");
		System.out.println(sbuilder);
		
		
	}

}
