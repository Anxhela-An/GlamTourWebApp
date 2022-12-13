package lesson4;

import lesson3.Product;
import lesson3.ProductItem;

public class ProductItemTax20
				extends ProductItem {

	public ProductItemTax20(Product product, 
							  double amount) {
		super(product, amount); 
	}

	public double getTaxValue() { 
		return 20;
	}

}
