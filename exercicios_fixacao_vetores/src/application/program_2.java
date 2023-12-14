package application;

import java.util.Locale;
import java.util.Scanner;

import entities.vector_2;

public class program_2 {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Quantos numeros voce vai digitar? ");
			
			int N = sc.nextInt();
			
			vector_2 vect[] = new vector_2[N];
					
			for(int i=0; i<vect.length; i++) {
				sc.nextLine();
				System.out.print("Digite um Numero: ");
				double valores = sc.nextDouble();
				vect[i] = new vector_2(valores);
			}
			
			//System.out.printf("VALORES = %.1f%n", vect[N].getValores());
			
			//System.out.println("VALORES = %.1f%n" + );
			
			double sum = 0.0;
			for(int i=0; i<vect.length; i++) {
				sum += vect[i].getValores();
			}
			System.out.printf("SOMA = %.2f%n", sum);
			
			double avg = 0;
			avg =  sum / N;
			System.out.printf("MÉDIA = %.2f%n", avg);
			
		
			sc.close();
	}

}
