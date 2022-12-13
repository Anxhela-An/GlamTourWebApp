package lesson3;

import lesson1.Id;

public abstract class ProductItem{
	
	/**
	 * produkt ne fature
	 * 
	 * ka te dhena produkti
	 * ka sasi
	 * 
	 * nuk duhet te jete objekt i ndryshueshem
	 * */

	private Product product;
	private double amount;
		
	protected ProductItem(Product product, 
					   double amount) {
		this.product = product.clone();
		if(amount < 1) {
			amount = 1;
		}
		this.amount = amount;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public Id getProductId(){
		return product.getId();
	}

	public double getProductPrice(){
		return product.getPrice();
	}
	
	public String getProductDescription() {
		return product.getDescription();
	}
	 
	public String getProductType (){
		return product.getType();
	}
	
	public String getProductModel(){
		return product.getModel();
	}

	@Override
	public String toString() {
		return "lesson3.ProductItem ["
				+ "product=" + product + 
				", amount=" + amount + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(amount);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ProductItem)) {
			return false;
		}
		ProductItem other = (ProductItem) obj;
		if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount)) {
			return false;
		}
		if (product == null) {
			if (other.product != null) {
				return false;
			}
		} else if (!product.equals(other.product)) {
			return false;
		}
		return true;
	} 
	
	public double getPriceWithTaxValue() {
		double price = getProductPrice() * amount;
		price = price + price * 
					getTaxValue() / 100;
		return price;
	}
	
	public abstract double getTaxValue();
	
}