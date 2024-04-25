package day4javaprograms;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		try {
			FileWriter fileWriter = new FileWriter("testone.txt");
			fileWriter.write("This is my First FileWriter program");
			fileWriter.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
