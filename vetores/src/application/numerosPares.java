package application;

import java.util.Locale;
import java.util.Scanner;

public class numerosPares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar?");
		
		int n = sc.nextInt();
		
		System.out.println("");
		
		int vect[] = new int[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números Pares: ");
		
		for(int i=0; i<n; i++) {
			if(i % 2 == 0) {
				System.out.println(vect[i]);
			}
		}
		
		sc.close();
	}

}
