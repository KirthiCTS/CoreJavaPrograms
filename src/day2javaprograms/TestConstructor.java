package day2javaprograms;

public class TestConstructor {
	
	 
	
	public  TestConstructor(){
		
		
		System.out.println("This is a constructor");
		
		int i = 10;
		int j = 20;
		
		int k = i + j;
		System.out.println(k);
		new TestConstructor(100,200);
		
		
	}
	
	public TestConstructor(int i, int j){
		
		int k = i + j;
		
		System.out.println(k);
		
		
	}
	
	public void testMethodInsideConstructor() {
		
		
		System.out.println("Method called from the TestConstructor class");
		
		
	}
	

	
	
	
	
	
	

}
