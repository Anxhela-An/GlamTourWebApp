package lesson1;

import java.util.GregorianCalendar;
import java.util.Scanner;

public final class Util {
	
	private Util() {}
	
	private static final Scanner INPUT = 
						new Scanner(System.in);
	
	public static Scanner getSystemInput() {
		return INPUT;
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if(a[j] < a[index]) {
					index = j;
				}
			}
			swap(a, i, index);
		}
	}

	public static void swap(int[] a, int i, int index) {
		int tmp = a[i];
		a[i] = a[index];
		a[index] = tmp;
	}

	public static int[] 
			getRandomIntArray(int length, int min, int max) { 
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = getRandomValue(min, max);
		}
		return a;
	}

	public static int getRandomValue(int min, int max) {
		return (int)(Math.random() * (max - min) + min);
	}

	public static String remove(String str, int index) { 
		return str.substring(0, index) + str.substring(index + 1);
	}

	public static String[] months() { 
		return new String[] {
				"january",
				"february",
				"march",
				"april",
				"may",
				"june",
				"july",
				"august",
				"september",
				"october",
				"november",
				"december"
		};
	}
	
	public static String getGregorianCalendarAsString(GregorianCalendar gc) {
		return String.format("%d, %s %d", gc.get(GregorianCalendar.YEAR),
										  months()[gc.get(GregorianCalendar.MONTH)],
										  gc.get(GregorianCalendar.DAY_OF_MONTH));
	}

	public static String getGregorianCalendarAsTimeString(GregorianCalendar gc) {
		return String.format("%02d:%02d:%02d", 
					gc.get(GregorianCalendar.HOUR_OF_DAY),
					gc.get(GregorianCalendar.MINUTE),
					gc.get(GregorianCalendar.SECOND));
	}


	public static String getGregorianCalendarAsDateAndTimeString(GregorianCalendar gc) {
		return getGregorianCalendarAsString(gc) + " " +
				getGregorianCalendarAsDateAndTimeString(gc);
	}

}