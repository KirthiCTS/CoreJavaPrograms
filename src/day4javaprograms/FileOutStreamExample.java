package day4javaprograms;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutStreamExample {

	public static void main(String[] args) {

		
		String values = "Java programming";
		
		try {
			FileOutputStream output = new FileOutputStream("output.txt");
			
			byte[] byteArr = values.getBytes();
			
			output.write(byteArr);
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
