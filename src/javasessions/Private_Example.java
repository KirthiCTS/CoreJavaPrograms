package javasessions;

public class Private_Example {
	
	private static void testPrivate() {
		
		
		System.out.println("Inside a private method");
		
	}
	
	public static void main(String[] args) {
		testPrivate();
		
		String str = "Cat";
		
		if(str.contains("Cat"))
			System.out.println();
	}
	

}
