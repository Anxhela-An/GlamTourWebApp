package lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example3 {

	static void method() {

		Scanner input = new Scanner(System.in);
		
		try {
			int n = input.nextInt();
		}
		catch(Exception e) {
			throw new InputMismatchException
				("Inputi i vendosur nuk eshte int.");
		}
		
	}
	
	public static void main(String[] args) {

		try {
			method();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			StackTraceElement[]a = e.getStackTrace();
			for(StackTraceElement element : a) {
				System.out.println(element.getFileName());
				System.out.println(element.getClassName());
				System.out.println(element.getMethodName());
				System.out.println(element.getLineNumber());
			}
		}
		
	}
	
}

