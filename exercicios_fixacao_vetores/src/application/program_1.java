package application;

import java.util.Locale;
import java.util.Scanner;

import entities.vector_1;

public class program_1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar? ");
		
		int N = sc.nextInt();
		
		vector_1[] vect = new vector_1[N];
		
		System.out.println("");
		
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite o número: ");
			int number = sc.nextInt();
			vect[i] = new vector_1(number);
		}
		System.out.println();
		
		sc.close();
	}

}
