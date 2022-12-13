package lesson8;

import java.net.URL;
import java.util.Scanner;

public class Example6 {
	
	public static void main(String[] args) {
 
		try { 
			String url = "https://www.facebook.com/";
			Scanner input = new Scanner
					(new URL(url).openStream());
			
			while(input.hasNextLine()) {
				System.out.println(input.nextLine());
			}
			
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}



