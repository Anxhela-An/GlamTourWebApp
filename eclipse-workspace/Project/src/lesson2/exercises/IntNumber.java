package lesson2.exercises;

public class IntNumber {
	
	private int value;
	
	/**
	 * Ne kete klase kemi objektiv te studiojme
	 * ndertimin e metodave qe kane te njejtin synim
	 * ndoshta ne te gjitha format e mundshme qe
	 * mund ti krijojme.
	 * Objektiv gjate kesaj kohe kemi qe te 
	 * riperdorim kodin sa me shume te jete e mundur.
	 * */
	
	public IntNumber(int value) {
		//this(new IntNumber(value));
		/**
		 * this i perdorur per te therritur
		 * konstruktorin e meposhtem nuk 
		 * arrin ne qellimin e tij sepse
		 * ne tentative per te krijuar 
		 * objektin qe merr si argument
		 * konstruktori tjeter, ky konstruktor
		 * therret veten ... e ben pafundesisht
		 * kete gje, duke shkaktuar 
		 * stackoverflow
		 * */
		this.value = value;
	}
	
	public IntNumber(IntNumber intNumber) {
		if(intNumber == null) {
			///ndalohet krijimi i objektit
			intNumber = new IntNumber(0);
		}
		value = intNumber.value;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isOdd() {
		/**if(value % 2 != 0) {
			return true;
		}
		return false;*/
		return value % 2 != 0;
	}
	
	public boolean isEven() {
		return !isOdd();
	}
	
	public boolean isPrime() {
		if(value < 2) {
			return false;
		}
		if(value == 2) {
			return true;
		}
		if(value % 2 == 0) {
			return false;
		}
		int v = 3;
		while(v * v <= value) {
			if(value % v == 0) {
				return false;
			}
			v = v + 2;
		}
		return true;
	}
	
	public static boolean isOdd(int value) {
		/**if(value % 2 != 0) {
			return true;
		}
		return false;
		return value % 2 != 0;*/
		return new IntNumber(value).isOdd();
	}
	
	public static boolean isEven(int value) {
		return !isOdd(value);
	}
	
	public static boolean isPrime(int value) {
		return new IntNumber(value).isPrime();
	}

	public static boolean isOdd(IntNumber value) {
		return new IntNumber(value).isOdd();
	}
	
	public static boolean isEven(IntNumber value) {
		return !isOdd(value);
	}
	
	public static boolean isPrime(IntNumber value) {
		return new IntNumber(value).isPrime();
	}

	public boolean isEqual(int value) {
		return isEqual(new IntNumber(value));
	}

	public boolean isEqual(IntNumber value) {
		if(value == null) {
			return false;
		}
		return this.value == value.value;
	}
	
	public static int convert(char[] value) {
		String stringValue = "";
		for(char c : value) {
			stringValue += c;
		}
		return convert(stringValue);
	}
	
	public static int convert(String value) 
	{
		return Integer.parseInt(value);
	}

}
