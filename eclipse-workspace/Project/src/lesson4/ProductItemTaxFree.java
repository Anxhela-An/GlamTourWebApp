package lesson4;

import lesson3.Product;
import lesson3.ProductItem;

public class ProductItemTaxFree 
				extends ProductItem {

	public ProductItemTaxFree(Product product, 
							  double amount) {
		super(product, amount); 
	}

	@Override
	public double getTaxValue() { 
		return 0;
	}

}
