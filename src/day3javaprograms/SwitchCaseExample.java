package day3javaprograms;

public class SwitchCaseExample {
	
	
	public static void switchCase(String browser) {
		
		
		switch(browser) {
		
			case "Chrome":
				System.out.println("Open the chrome browser");
				break;
				
			case "Firefox":
				System.out.println("Open the Firefox browser");
				break;
			
			case "Edge":
				System.out.println("Open the Edge browser");
				break;
				
			default:
				System.out.println("Open the Opera browser");
		
		}
		
	}
	
	

	public static void main(String[] args) {
		
		
		switchCase("Firefox");

	/*	int day = 4;
		
		switch(day) {
		
		case 1:
			System.out.println("Monday");
			break;
		
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
		
		case 4:
			System.out.println("Thursday");
			break;
		
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
		
		case 7:
			System.out.println("Sunday");
			break;

		
		}
		
		*/
		
		
		
		
	}

}
