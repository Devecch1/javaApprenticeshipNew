// ENCAPSULAMENTO 

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.products_encapsulamento;

public class program_encapsulamento {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		int quantity = sc.nextInt();

		products_encapsulamento products_encapsulamento = new products_encapsulamento(name, price, quantity);
		
		products_encapsulamento.setName("computer"); //ALTEREI O NOME 
		System.out.println("Update name: " + products_encapsulamento.getName()); //ACESSANDO O PRODUTO //INFORMANDO QUE ATUALIZEI 

		System.out.println();
		System.out.println("Product data: " + products_encapsulamento);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
		products_encapsulamento.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + products_encapsulamento);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		products_encapsulamento.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + products_encapsulamento);

		sc.close();

	}

}
