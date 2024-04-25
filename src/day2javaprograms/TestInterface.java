package day2javaprograms;

public interface TestInterface extends TestInterfaceTwo {
	
	
	public String str = "Variable inside an interface";
	
	public void test();
	
	
	public static void testStaticInsideInterface() {
		
		System.out.println("Inside static method of an interface");
		testPrivateInterface();
	}
	
	private static void testPrivateInterface() {
		
		System.out.println("Inside Interface's private method");
		
	}
	
	

}
