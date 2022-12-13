package lesson8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Example4 {
	
	public static void main(String[] args) {

		File file = new File("c:/users/"
				+ "professional/desktop/info.txt");

		/**
		 *	Bej nje program qe lexon permbajtje
		 *tekst nga perdoruesi deri ne shtypjen
		 *e karaktereve "stop". Te gjithe
		 *permbajtjen e lexuar ruaje ne skedar
		 *info.txt. 
		 **/
		
		try {
			PrintWriter output = new  PrintWriter(file);
			Scanner input = new Scanner(System.in);
			
			do {
				System.out.print("Vendos tekst: ");
				String str = input.nextLine();
				if(str.contains("stop")) {
					break;
				}
				output.println(str);
			}while(true);
			
			input.close();
			output.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}






