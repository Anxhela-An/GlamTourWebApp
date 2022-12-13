package lesson7.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 
{  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Ju lutem vendosni dy numra");

	try {
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(a + b);
	} catch (Exception e) {
		System.out.println("NUk jane numra Int!");
	}

}


}
