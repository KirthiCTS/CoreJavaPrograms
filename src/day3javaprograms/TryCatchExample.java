package day3javaprograms;

public class TryCatchExample {
	
	
	static void testException() {
		
		String value = "";
		String name = "";
		
		try {
			
			 value = "Kirthivasan";
			 name = value.substring(0, 13);
			 
			 System.out.println(name);
			
			int i = 100;
			int j = 10;
			
			int k = i/j;
			
			System.out.println(k);
			
			
		}
		catch(StringIndexOutOfBoundsException | ArithmeticException e) {
			
			int i = 100;
			int j = 0;
			
			int k = i/j;
			System.out.println(k);

			e.printStackTrace();
		}
		
		catch(Exception e) {
			
			System.err.println(e.getMessage());
		}
		
		
		finally {
			
			
			System.out.println("Inside the finally block");
			
		}
		
		
		
	}
	
	
	static void printValue() throws NullPointerException, ArithmeticException {
		
		
		String str = null;
		System.out.println(str.length());
		
		
	}
	
	static void testThrow(int val) {
		
		if(val < 1)
			
			throw new ArithmeticException("Arithmetic Exception is thrown as the value is < 1");
		else
			System.out.println(val);
		
		
	}
	
	
	

	public static void main(String[] args) {

		
		testException();
		//printValue();
		//testThrow(-1);
		
		
	}

}
