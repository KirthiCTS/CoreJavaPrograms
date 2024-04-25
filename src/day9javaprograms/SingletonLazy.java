package day9javaprograms;

public class SingletonLazy {
	
	
	private static SingletonLazy instance;
	
	
	
	private SingletonLazy() {
		
		
	}
	
	
	public synchronized static SingletonLazy getInstance() {
		
		if(instance == null)
		{
			instance = new SingletonLazy();
			
		}
		
		return instance;
		
		
	}
	
	
	public void testSingleton() {
		
		System.out.println("Inside a method from the singleton class");
	}
	
	
	

	public static void main(String[] args) {

		SingletonLazy obj1 = SingletonLazy.getInstance();
		SingletonLazy obj2 = SingletonLazy.getInstance();
		SingletonLazy obj3 = SingletonLazy.getInstance();
		
		
		System.out.println("Hashcode value of first object: "+obj1.hashCode());
		System.out.println("Hashcode value of second object: "+obj2.hashCode());
		System.out.println("Hashcode value of third object: "+obj3.hashCode());
		
		
		SingletonLazy.getInstance().testSingleton();
		
		
		
	}

}
