package lesson1.exercises;

public class Vehicle {

	public static final double MINIMAL_EFFICENCE = 5;
	public static final double MAXIMAL_EFFICENCE = 25;
	
	private double efficence, deposite;
	private boolean isOn;
	
	public Vehicle(double efficence) { 
		if(efficence < MINIMAL_EFFICENCE || 
		   efficence > MAXIMAL_EFFICENCE) {
			efficence = MAXIMAL_EFFICENCE;
		}
		this.efficence = efficence;
	}

	public void turnOn(){
		if(deposite > 0) {
			isOn = true;
		}
	}

	public void turnOff(){ 
		isOn = false; 
	}
	
	public double getDeposite() {
		return deposite;
	}
	
	public void addFuel(double amount) {
		if(!isOn && amount > 0) {
			deposite = deposite + amount;
		}
	}
	
	public double getDistance() {
		return deposite * efficence;
	}
	
	public void drive(double distance){
		if(isOn) {
			if(getDistance() >= distance) {
				consume(distance);
			}
			else {
				fail();
			}
		}
	}

	private void fail() {
		deposite = 0;
		turnOff();
	}

	private void consume(double distance) { 
		deposite = deposite - distance / efficence;
	}

}
