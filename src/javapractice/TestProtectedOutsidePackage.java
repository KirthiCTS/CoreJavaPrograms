package javapractice;

import javasessions.Protected_Example;

public class TestProtectedOutsidePackage extends Protected_Example {
	
	@Override
	protected void testProtected() {
		// TODO Auto-generated method stub
		super.testProtected();
	}

	public static void main(String[] args) {

		
		Protected_Example obj = new Protected_Example();
	//	obj.testProtected();
	}

}
