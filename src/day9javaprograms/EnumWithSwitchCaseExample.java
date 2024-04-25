package day9javaprograms;

public class EnumWithSwitchCaseExample {
	
	
	enum Color{
		
		RED,
		GREEN,
		BLUE,
		YELLOW;
	}
	
	

	public static void main(String[] args) {

		
		Color color = Color.YELLOW;
		
		switch(color) {
		
		case RED:
			System.out.println("RED Color");
			break;
		
		case GREEN:
			System.out.println("GREEN Color");
			break;
			
		case BLUE:
			System.out.println("BLUE Color");
			break;
			
		default:
			System.out.println("Some other color");
		
		}
		
		
		
	}

}
