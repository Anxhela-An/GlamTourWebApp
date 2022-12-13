package lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example3 {
	
	public static void main(String[] args) {

		File file = new File("c:/users/"
				+ "professional/desktop/info.klausdjali");
		
		try {
			
			PrintWriter output = new PrintWriter(file);
			output.println("Zoti Klaus, eshte nje nga studentet e kursit.");
			output.println("Zoti Klaus, eshte nje nga studentet me te dobet te kursit.");
			output.println("Zoti Klaus, eshte nje nga studentet me te zhurmshem te kursit.");
			output.close();
			
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			input.close();
			
		} catch (FileNotFoundException e) { 
			e.printStackTrace();
		}
		
	}

}






