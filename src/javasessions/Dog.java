package javasessions;

public class Dog extends Animal{
	
	
	
	@Override
	public void sound() {
		// TODO Auto-generated method stub
		super.sound();
		
		System.out.println("This is from the child class");
	}
	
	
	public static void main(String[] args) {
		
		Dog obj = new Dog();
		obj.sound();
		
		
	}
	
	

}
