package javasessions;

public class Animal {
	
	
	public class innerClass{
		
		public void test() {
			
			System.out.println("This is from inner class");
		}
		
		
	}
	
	public void sound() {
		
		System.out.println("This is from the parent class");
		
	}
	
	
	
	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		Animal.innerClass innerObj = animal.new innerClass();
		innerObj.test();
		
		
	}
	

}
