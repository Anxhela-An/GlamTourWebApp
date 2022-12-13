package lesson8;

import java.io.File;
import java.io.IOException;

public class Example2 {
	
	public static void main(String[] args) {

		File file = new File("c:/users/"
				+ "professional/desktop/info.klausdjali");
		
		System.out.println(file.exists());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		System.out.println(file.isAbsolute());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		try {
			file.createNewFile();
		} catch (IOException e) { 
			e.printStackTrace();
		}

		System.out.println(file.exists());
		System.out.println(file.canExecute());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.isHidden());
		System.out.println(file.isAbsolute());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
	
	}

}


