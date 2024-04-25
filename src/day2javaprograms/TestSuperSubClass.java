package day2javaprograms;

public class TestSuperSubClass extends TestSuperParentClass {
	
	
	
	public void testSuperKeyword() {
		super.testSuper();
		System.out.println(super.str);
		
	}
	
	
	public TestSuperSubClass() {
		super();
		
	}
	
	public static void main(String[] args) {
		
		TestSuperSubClass obj = new TestSuperSubClass();
		obj.testSuperKeyword();
		
		
	}

}
