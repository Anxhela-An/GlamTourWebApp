package lesson3;

import lesson1.Id;

public class Product {

	/***
	 * id			e pandryshueshme
	 * tip			e pandryshueshme
	 * model		e pandryshueshme
	 * cmim			e ndryshueshme
	 * pershkrim	e ndryshueshme	
	 * */
	
	private Id id;
	private String type, model, description;
	private double price;
	
	public Product(String type, String model) {
		this(type, model, "", 0);
	}

	public Product(String type, String model,
				   String description, double price) {
		if(price < 0) {
			//nuk duhet te krijohet objekt
			price = 0;
		}
		this.id = new Id();
		this.type = type;
		this.model = model;
		this.description = description;
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Id getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public String getModel() {
		return model;
	}

	@Override
	public String toString() {
		return "lesson3.Product [id=" + id + 
				", type=" + type + 
				", model=" + model + 
				", description=" + description + 
				", price=" + price + "]";
	} 
	
	public Product clone() {
		Product product =
			new Product(type, model, 
					    description, price);
		product.id = id.clone();
		return product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Product)) {
			return false;
		}
		Product other = (Product) obj;
		if (description == null) {
			if (other.description != null) {
				return false;
			}
		} else if (!description.equals(other.description)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (model == null) {
			if (other.model != null) {
				return false;
			}
		} else if (!model.equals(other.model)) {
			return false;
		}
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price)) {
			return false;
		}
		if (type == null) {
			if (other.type != null) {
				return false;
			}
		} else if (!type.equals(other.type)) {
			return false;
		}
		return true;
	}
	 
}