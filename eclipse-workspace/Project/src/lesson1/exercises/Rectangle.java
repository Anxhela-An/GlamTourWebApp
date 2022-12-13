package lesson1.exercises;

public class Rectangle {
	
	private double width, height;
	
	/**
	 * width dhe height do jene me vlera te
	 * pandryshueshme, nuk do krijojme per to
	 * metoda set.
	 * Nuk ka kuptim te krijoj konstruktor
	 * pa parametra.
	 * Mund te krijoj nje konstruktor me
	 * 2 parametra, nga nje per cilesi.
	 * */
	
	public Rectangle(double width, double height) {
		if(width <= 0) {
			//e pakuptimte
			//nuk mund te krijohet nje objekt
			//me te dhene te tille
			width = 1;
		}
		if(height <= 0) {
			//e pakuptimte
			//nuk mund te krijohet nje objekt
			//me te dhene te tille
			height = 1;
		}
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Duke qene se kjo klase mund te perdoret
	 * per te krijuar katrore, mund te projektojme
	 * edhe nje konstruktor me vetem nje parameter,
	 * dimesnionin.
	 * */

	public Rectangle(double edge) {
		this(edge, edge);
	}
	
	/**
	 * Duke qene se mund te keme ndonjehere interes
	 * per te klonuar objekt ekzistues, mund te
	 * krijoj edhe nje konstruktor kopjues. 
	 * Konstruktori kopjues merr si argument
	 * nje objekt te klases dhe i vendos objektit
	 * te ri te njejtat vlera per atributet qe 
	 * ka edhe objekti ne argument.
	 **/
	
	public Rectangle(Rectangle r) {
		width = r.width;
		height = r.height;
	}
	
	public double getWidth(){
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea(){
		return width * height;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
	
}