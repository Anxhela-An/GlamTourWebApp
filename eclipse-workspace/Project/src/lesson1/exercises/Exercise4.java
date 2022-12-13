package lesson1.exercises;

import java.util.Arrays;
import lesson1.Util;
public class Exercise4 
{

	public static void main(String[] args) {

		int[] a = Util.getRandomIntArray(100_000, -10, 10);
		Chronometer c = new Chronometer();
		//Util.sort(a);
		Arrays.sort(a);
		c.stop();
		System.out.println(c.getDuration());
	
	}

}
