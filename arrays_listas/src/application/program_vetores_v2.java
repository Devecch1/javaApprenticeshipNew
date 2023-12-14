package application;

import java.util.Locale;
import java.util.Scanner;

import entities.product_v2;

public class program_vetores_v2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		product_v2[] vect = new product_v2[N];
		
		for(int i=0; i<vect.length; i++) {  // O N está sendo substituido por um vect.length
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new product_v2(name,price);
			
		}
		
		double sum = 0.0;
		for(int i=0; i<vect.length; i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum / vect.length;
		
		System.out.printf("AVERAGE PRICE = %.2f ", avg);
		
		sc.close();
	}

}
