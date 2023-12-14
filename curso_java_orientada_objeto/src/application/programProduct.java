package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product;

public class programProduct {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		product product = new product();
		
		System.out.println("Enter product data: ");
		
		System.out.print("Name: ");
		product.name = sc.nextLine(); // ARMAZENA O NOME E GUARDA DENTRO DA VARIÁVEL
		
		System.out.print("Price: ");
		product.price = sc.nextDouble(); // ARMAZENA O PREÇO DENTRO DA VARIÁVEL
		
		System.out.print("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		System.out.println();
		System.out.println("Product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("New product data: " + product.toString());
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("New product data: " + product.toString());
		
		sc.close();
	}

}
