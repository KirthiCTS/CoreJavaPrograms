package day9javaprograms;

public class StaticBlockExample {
	
	static int i = 0;
	
	static {
		
		i = 10;
		System.out.println("Static block executed");
		
	}
	
	public StaticBlockExample() {
		System.out.println("Constructor executed");
	
	}
	
	

	public static void main(String[] args) {

		new StaticBlockExample();
		
		System.out.println("Value of i is: "+i);
		
		
	}

}
