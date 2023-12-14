package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rent;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		rent r = new rent("Bruno Devechi", "brunodevecchi17@gmail.com");
		
		System.out.println(r);
		
		System.out.println("How many rooms will be rented? ");
		
		
		
		sc.close();
	}

}
