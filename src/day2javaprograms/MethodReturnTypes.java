package day2javaprograms;

public class MethodReturnTypes {
	
	
	
	
	
	public int returnValue() {
		
		int i = 100;
		int j = 200;
		int k = i + j;
		
		
		return k;
		
	}
	
	public int returnValue(int i, int j) {
		
		int k = i + j;
		
		return k;
		
	}
	
	
	public static String returnAStringValue() {
		
		String str = "String return type";
		
		return null;
		
	}
	
	public boolean isDone() {
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		MethodReturnTypes obj = new MethodReturnTypes();
		int value = obj.returnValue(100,200);
		System.out.println(value);
		
		System.out.println(returnAStringValue());
		
		
	}
	
	

}
