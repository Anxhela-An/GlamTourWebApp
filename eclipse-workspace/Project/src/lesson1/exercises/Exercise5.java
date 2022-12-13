package lesson1.exercises;

public class Exercise5 {

	public static void main(String[] args) {

		Vehicle v = new Vehicle(20);
		v.addFuel(1);
		v.turnOn();
		v.addFuel(10);
		System.out.println(v.getDeposite());
		System.out.println(v.getDistance());
		v.drive(750);
		v.turnOff();
		System.out.println(v.getDeposite());
		
	}
 
}