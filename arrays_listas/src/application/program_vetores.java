package application;

import java.util.Locale;
import java.util.Scanner;

public class program_vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double[] vect = new double[N]; // CRIAÇAO DO VETOR
		
		for(int i=0; i<N; i++) {				// O VETOR VAI JOGAR ATÉ DAR A QUANTIDADE DE N QUE EU DISSE QUE QUERO
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;						// VOU PEGAR UM SUM COM INICIAL 0 E IR SOMANDO TODAS AS ALTURAS
		for(int i=0; i<N; i++) {
			sum += vect[i];
		}
		
		double avg = sum / N;					// VOU GERAR A MÉDIA
		
		System.out.printf("AVERAGE HEIGHT = %.2f", avg);
		
			
		
		
		
		
		sc.close();
	}

}
