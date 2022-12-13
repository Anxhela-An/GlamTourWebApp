package lesson5.exercises;

public class RationalNumber 
				extends Number 
				implements Comparable<RationalNumber>{
 
	private static final long 
	     serialVersionUID = 4129265675326336233L;
	
	private long numerator, denominator;
				//numerues
				//--------
				//emerues
	
	/**
	 *	shenja te ruhet nga numerator
	 * 	denominator gjithmone vlere > 0
	 **/
	public RationalNumber(long numerator, 
						  long denominator) {
		if(denominator == 0) {
			numerator = 0;
			denominator = 1;
		}
		else if(denominator < 0) {
			numerator = -numerator;
			denominator = -denominator;
		}
		int d = 2;
		while(d <= Math.abs(numerator) &&
			  d < denominator) {
			if(numerator % d == 0 &&
			   denominator % d == 0) {
				numerator = numerator / d;
				denominator = denominator / d;
			}
			else {
				d++;
			}
		}
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public RationalNumber(long numerator) {
		this(numerator, 1);
	}
	
	public long getNumerator() {
		return numerator;
	}
	
	public long getDenominator() {
		return denominator;
	}

	public RationalNumber add(RationalNumber o) {
		long d = denominator * o.denominator;
		long n = d / denominator * numerator + 
				 d / o.denominator * o.numerator;
		return new RationalNumber(n, d);
	}

	public RationalNumber subtract(RationalNumber o) {
		long d = denominator * o.denominator;
		long n = d / denominator * numerator -  
				 d / o.denominator * o.numerator;
		return new RationalNumber(n, d);
	}

	public RationalNumber multiply(RationalNumber o) {
		return new RationalNumber(numerator * o.numerator, 
								  denominator * o.denominator);
	}

	public RationalNumber divide(RationalNumber o) {
		return new RationalNumber(numerator * o.denominator, 
								  denominator * o.numerator);
	}
	
	@Override
	public int compareTo(RationalNumber o) {
		if(o == null) {
			return 1;
		}
		//return intValue() - o.intValue();
		if(doubleValue() < o.doubleValue()) {
			return -1;
		}
		if(doubleValue() > o.doubleValue()) {
			return 1;
		}
		return 0;
	}

	@Override
	public int intValue() { 
		return (int)longValue();
	}

	@Override
	public long longValue() { 
		return numerator / denominator;
	}

	@Override
	public float floatValue() { 
		return (float)doubleValue();
	}

	@Override
	public double doubleValue() {
		return (double)numerator / denominator;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (denominator ^ (denominator >>> 32));
		result = prime * result + (int) (numerator ^ (numerator >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof RationalNumber)) {
			return false;
		}
		RationalNumber other = (RationalNumber) obj;
		if (denominator != other.denominator) {
			return false;
		}
		if (numerator != other.numerator) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "lesson5.exercises.RationalNumber "
				+ "[numerator=" + numerator + 
				  ", denominator=" + denominator + "]";
	}
	
	

}