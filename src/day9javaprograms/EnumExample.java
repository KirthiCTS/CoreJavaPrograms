package day9javaprograms;

public enum EnumExample implements TestInterface{
	
	RED,
	GREEN,
	BLUE,
	YELLOW,
	BROWN;
	
	private EnumExample(){
		
		
		System.out.println("Inside Enum Constructor");
	}
	
	public static void test() {
		
		System.out.println("Inside a enum method");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(EnumExample.RED);
		test();
		
	}

	@Override
	public void testEnumInterface() {
		// TODO Auto-generated method stub
		
	}
	
	

}
