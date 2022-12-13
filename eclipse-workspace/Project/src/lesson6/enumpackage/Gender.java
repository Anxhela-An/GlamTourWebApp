package lesson6.enumpackage;

public enum Gender {
	
	MALE('m', 18.5, 25), 
	FEMALE('f', 18.5, 23), 
	OTHER('o');

	private char symbol;
	private double minWeightIndex;
	private double maxWeightIndex;
	
	private Gender(char symbol) {
		this(symbol, 18.5, 25);
	}
	
	private Gender(char symbol,
		   double minWeightIndex, 
		   double maxWeightIndex) {
		this.symbol = symbol;
		this.minWeightIndex = minWeightIndex;
		this.maxWeightIndex = maxWeightIndex;
		System.out.println("U krijua " + this);
	}

	public char getSymbol() {
		return symbol;
	}
	
	public double getMinWeightIndex() {
		return minWeightIndex;
	}
	
	public double getMaxWeightIndex() {
		return maxWeightIndex;
	}
	
	@Override
	public String toString() { 
		return "lesson6.Gender[gender="
				+ super.toString()  
				+ ", symbol=" + symbol
				+ ", minWeightIndex=" + minWeightIndex
				+ ", maxWeightIndex=" + maxWeightIndex;
	}
	
}