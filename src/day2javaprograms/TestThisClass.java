package day2javaprograms;

public class TestThisClass {
	
	
	
	
	
	public TestThisClass(){
		this("Calling a constructor");
		
	}
	
	
	public TestThisClass(String str){
		System.out.println(str);
		
	}
	
	private final String str = "To try this keyword";
	
	public void testThisMethod() {
		
		
		System.out.println("To to this keyword");
	}
	
	
	public void callingMethod() {
		
		String val = this.str;
		System.out.println(val);
		
		this.testThisMethod();
		
	}
	
	
	
	
	

}
