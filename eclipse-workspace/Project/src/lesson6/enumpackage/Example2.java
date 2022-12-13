package lesson6.enumpackage;

public class Example2 {

	public static void main(String[] args) {

		Enum[] values = Gender.values();
		
		for(Enum v : values) {
			System.out.println(v);
		}
		
	}

}
