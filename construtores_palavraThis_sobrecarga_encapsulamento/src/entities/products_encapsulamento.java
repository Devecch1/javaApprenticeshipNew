// ENCAPSULAMENTO

package entities;

public class products_encapsulamento {

	private String name;
	private double price; // ATRIBUTO
	private int quantity;

	public products_encapsulamento(String name, double price, int quantity) { // ISSO É O CONSTRUTOR, ELE ESTÁ OBRIGANDO
																				// DECLARAR O OBJETO PARA QUE NÃO SUBA
																				// NULO OU ZERADO
		this.name = name;
		this.price = price; // THIS ESTÁ REFERENCIANDO O PRÓPRIO OBJETO
		this.quantity = quantity; // DIFERENCIANDO ATRIBUTO DE VARIAVEL LOCAIS // VARIAVEL LOCAL
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) { // PARAMETRO DO ENCAPSULAMENTO // METODO PARA ALTERAR O PREÇO
		this.name = name;			   // ELE NÃO RETORNA NADA
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {  // ELE NAO VAI TER SET FATO DE QUE NÃO PODE SER ALTERADO POR REGRA, JA QUE POSSUI SUA REGRA DE CALCULO LA EMBAIXO
		return quantity;
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
