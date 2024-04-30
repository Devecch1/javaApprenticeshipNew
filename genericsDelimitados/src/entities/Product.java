package entities;

public class Product implements Comparable<Product>{				// FAZER COM QUE MINHA CLASSE PRODUCT SEJA UMA CLASSE QUE IMPLEMENTE A INTERFACE COMPARABLE

	private String name;
	private double price;
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return name + " - " + String.format("%.2f", price);			// toString IMPRIMINDO NOME E PREÇO DO PRODUTO
	}

	@Override
	public int compareTo(Product other) {
		return Double.compare(price, other.getPrice());
	}






	
	
}
 