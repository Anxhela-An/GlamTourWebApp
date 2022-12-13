package lesson3;

import java.util.ArrayList;
import java.util.GregorianCalendar;

import lesson1.Id;
import lesson1.Util;

public class Purchase {
/**
 * 
	per cdo blerje ruhet id,
						data dhe ora, 
						lista e produkteve
						
	cdo gje e pandryshueshme
	
 * */
	
	private Id id;
	private GregorianCalendar dateAndTime;
	private ArrayList<ProductItem> products;
	
	public Purchase(ArrayList<ProductItem> products) {
		id = new Id();
		dateAndTime = new GregorianCalendar();
		this.products = new ArrayList<ProductItem>();
		for(ProductItem p : products) {
			this.products.add(p);
		}
	}
	
	public Id getId() {
		return id;
	}
	
	public long getDateAndTimeInMillis() {
		return dateAndTime.getTimeInMillis();
	}
	
//	public void addProduct(ProductItem productItem){
//		products.add(productItem);
//	}
	
	public ProductItem getProductItem(int index){
		if(index < 0 || index > getProductsSize() - 1) {
			return null;
		}
		return products.get(index);
	}

	public int getProductsSize() { 
		return products.size();
	}
	
	@Override
	public String toString() {
		return "lesson3.Purchase["
				+ "id=" + id 
				+ ", dateAndTime=" + Util.getGregorianCalendarAsString(dateAndTime) 
				+ ", products=" + products + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateAndTime == null) ? 0 : dateAndTime.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Purchase)) {
			return false;
		}
		Purchase other = (Purchase) obj;
		if (dateAndTime == null) {
			if (other.dateAndTime != null) {
				return false;
			}
		} else if (!dateAndTime.equals(other.dateAndTime)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (products == null) {
			if (other.products != null) {
				return false;
			}
		} else if (!products.equals(other.products)) {
			return false;
		}
		return true;
	} 
	
}