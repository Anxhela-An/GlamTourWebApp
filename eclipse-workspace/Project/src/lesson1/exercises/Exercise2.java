package lesson1.exercises;

public class Exercise2 {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10, 25);
		Rectangle r2 = new Rectangle(r1);
		Rectangle r3 = new Rectangle(10);
		 
		System.out.println(r1.getWidth() + " " + r1.getHeight());
		System.out.println(r2.getWidth() + " " + r2.getHeight());
		System.out.println(r3.getWidth() + " " + r3.getHeight());
			

	}

}