package application;

import java.util.Locale;
import java.util.Scanner;

public class maiorPosicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você vai digitar? ");
		
		double maiorValor = 0;
		int posMaiorValor = 0;
		
		int n = sc.nextInt();
		
		double vect[] = new double [n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > maiorValor) {
				maiorValor = vect[i];
				posMaiorValor = i;
			}
		}
		
		System.out.printf("MAIOR VALOR: %.1f%n", maiorValor);
		System.out.println("POSIÇÃO DO MAIOR VALOR: " + posMaiorValor);

		
		sc.close();
	}

}
