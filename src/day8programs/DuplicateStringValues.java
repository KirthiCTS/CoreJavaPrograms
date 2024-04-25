package day8programs;

import java.util.Set;
import java.util.TreeSet;

public class DuplicateStringValues {

	public static void main(String[] args) {

		String strArr [] = {"Java","Javascript","Python","Java","Python","GoLang"};
		
		Set<String> setObj = new TreeSet<String>();
		
		for(int i = 0; i<strArr.length ; i++) {
			
			if(setObj.add(strArr[i]) == false)
			{
				
				System.out.println("It is a duplicate: "+strArr[i]);
			}
			
			
		}
		
	}

}
