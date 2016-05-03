package models;

public class Product{

	public Long ean;
	public String name;
	public String description;
	
	public Product() {
	}

	public Product(Long ean, String name, String description) {
		this.ean = ean;
		this.name = name;
		this.description = description;
	}

	public String toString() {
		return String.format("%s - %s", ean, name);
	}	
	
	

	
}
