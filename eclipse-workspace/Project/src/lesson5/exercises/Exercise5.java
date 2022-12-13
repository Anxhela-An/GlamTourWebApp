package lesson5.exercises;

public class Exercise5 {
	
	public static 
		<E extends Comparable<E>> 
			E max(E[][] matrix) {
		if(matrix.length == 0) {
			return null;
		}
		E r = null; 
		for(E[] array : matrix) {
			if(array != null) {
				for(E value : array) {
					if(r == null ||
					   value.compareTo(r) > 0) {
						r = value;
					}
				}
			}
		}
		return r;
	}
	
	public static void main(String[] args) {
		
		Integer[][] matrixOfIntegers
			= new Integer[][]{
			null,
			{},
			{10, 7, 4},
			{31, -19}
		};
		
		Integer max = max(matrixOfIntegers);
		
		System.out.println(max);
	}
	
}