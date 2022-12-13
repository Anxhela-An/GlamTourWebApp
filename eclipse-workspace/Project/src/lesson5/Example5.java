package lesson5;

public class Example5 {

	/***
	 * Bej nje metode qe merr
	 * si argument nje vektor
	 * me tip int dhe kthen
	 * vleren me te madhe te tij.
	 **/
	
	public static int max(int[] a) {
		int m = a[0];
		for(int v : a) {
			if(v > m) {
				m = v;
			}
		}
		return m;
	}
	/***
	 * Bej nje metode qe merr
	 * si argument nje vektor
	 * me tip double dhe kthen
	 * vleren me te madhe te tij.
	 **/
	
	public static double max(double[] a) {
		double m = a[0];
		for(double v : a) {
			if(v > m) {
				m = v;
			}
		}
		return m;
	}
	
	/***
	 * Bej nje metode qe merr
	 * si argument nje vektor
	 * me tip te pa specifikuar
	 * dhe kthen vleren me te madhe te tij.
	 **/
	
	public static <T extends Comparable<T>> 
						T max(T[] a) {
		T m = a[0];
		for(T v : a) {
			if(v.compareTo(m) > 0) {
				m = v;
			}
		}
		return m;
	}
	
}
