// CONSTRUTORES

package entities;

public class products {

	public String name;
	public double price;			// ATRIBUTO
	public int quantity;

	public products(String name, double price, int quantity) { // ISSO É O CONSTRUTOR, ELE ESTÁ OBRIGANDO DECLARAR O OBJETO PARA QUE NÃO SUBA NULO OU ZERADO
		this.name = name;
		this.price = price;          // THIS ESTÁ REFERENCIANDO O PRÓPRIO OBJETO
		this.quantity = quantity;	 // DIFERENCIANDO ATRIBUTO DE VARIAVEL LOCAIS // VARIAVEL LOCAL
	}
	
	public double totalValueInStock() {
		return (price * quantity);
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // COMO SE FOSSE " this.quantity = quantity + quantity; "
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity; // COMO SE FOSSE " this.quantity = quantity - quantity; "
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}

}
