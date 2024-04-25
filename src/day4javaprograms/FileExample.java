package day4javaprograms;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args) {

		
		
		File fileObj  = new File("testone.txt");
		
		try {
			if(fileObj.createNewFile())
			{	System.out.println("File is created: "+fileObj.getName());
				System.out.println("File is created: "+fileObj.getAbsolutePath());
			}
			else
				System.out.println("File is not created:");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}
