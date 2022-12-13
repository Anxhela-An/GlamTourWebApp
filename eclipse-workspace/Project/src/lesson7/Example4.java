package lesson7;

import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {

		method1();
		
	}

	private static void method1() {
		try {
			method2();
		}
		catch(ArithmeticException e) {
			System.out.println("Ckemi?");
			System.out.println("Si je?");
		}
		catch(RuntimeException e) {
			System.out.println("Dicka shkoi keq!");
		}
		catch(Exception e) {
			System.out.println("Dicka shkoi keq!");
		}
		finally {
			System.out.println("Gjerat shkuan mire "
					+ "per metoden 1 dhe metoden 2.");
		}
		System.out.println("Si ke qene? " + 1 / 0);
	}

	private static void method2() {
		method3();
		System.out.println("Si je? " + 1 / 0);
	}

	private static void method3() {
		System.out.println("Ckemi? " + 1 / 0);
	}
	
}
