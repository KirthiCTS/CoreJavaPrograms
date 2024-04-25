package day2javaprograms;

public class TestClassWithInterface implements TestInterface, TestInterfaceTwo {
	
	
	
	
	

	public static void main(String[] args) {
		
		TestInterface.testStaticInsideInterface();
		System.out.println(TestInterface.str);

	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void testInterfaceTwo() {
		// TODO Auto-generated method stub
		
	}

}
