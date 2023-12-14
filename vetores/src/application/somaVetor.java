package application;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("QUANTOS NÚMEROS VOCÊ VAI DIGITAR?");
		
		int n = sc.nextInt();
		
		double vect[] = new double[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite um um número: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		System.out.printf("SOMA = %.2f%n",sum);
		
		double avg = sum / n;
			
		System.out.printf("MÉDIA = %.2f%n", avg);
		
		sc.close();
	}

}
