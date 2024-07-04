package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase())); 
		// Coloquei uma expressao Lambda queé uma expressao anonima
		// Portanto isso acima é um comparator definido com a sintaxe de uma expressão Lambda
		
		
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
