package day4javaprograms;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderExample {

	public static void main(String[] args) {

		
		try {
			FileReader fileReader = new FileReader("testone.txt");
			Scanner scanner = new Scanner(fileReader);
			while(scanner.hasNextLine())
			{
				String text = scanner.nextLine();
				System.out.println(text);
				
			}
			
			scanner.close();
			fileReader.close();
				
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
