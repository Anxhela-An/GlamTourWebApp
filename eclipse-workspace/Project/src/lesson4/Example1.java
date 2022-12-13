package lesson4;

import lesson3.Product;
import lesson3.ProductItem;

public class Example1 {
	
	/**
	 * Ne gjuhen Java, trashegimia e 
	 * klasave eshte nje-fishe.
	 * 
	 * 	+ trashegimi shumefishe
	 * 
	 * 	interface
	 * 
	 * Te percaktojme ne nje supertip
	 * metoda te pazhvilluara, me qellim
	 * qe te jemi te detyruar tek nenklasat
	 * ti zhvillojme sipas natyres qe ka
	 * secili tip.
	 * Duke i patur keto metoda tek supertipi
	 * ne mund ti perdorim, pavaresisht qe
	 * akoma nuk dihet se cfare ben secila.
	 * 
	 * 	class abstract
	 * 
	 * */
	
	public static void main(String[] args) {
		
		ProductItem p = 
				new ProductItemTax20
					(new Product("", "", "", 
							1000), 10);
		
		double price = ((ProductItemTax20)p).getPriceWithTaxValue();
		double tax = ((ProductItemTax20)p).getTaxValue();

		System.out.println(price);
		System.out.println(tax);
		
		
		
	}

}
