package day3javaprograms;

public class CotentEqualsExample {

	public static void main(String[] args) {

		
		
		StringBuffer sbuffer1 = new StringBuffer("Java Programming");
		StringBuffer sbuffer2 = new StringBuffer("Java1 Programming");
		
			System.out.println(sbuffer1.compareTo(sbuffer2));
			
			StringBuilder sbuilder1 = new StringBuilder("Java Programming");
			StringBuilder sbuilder2 = new StringBuilder("Java1 Programming");
			
         System.out.println(sbuilder1.compareTo(sbuilder2));
         
         
         String str1 = "Java Programming";
         String str2 = "Python Programming";
         
         if(str1.contentEquals(sbuilder1))
        	 System.out.println("Equals");
         else
        	 System.out.println("Not Equals");
         
         if(str1.equals(str2));
	}

}
