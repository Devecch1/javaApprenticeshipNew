package application;

import java.util.Scanner;

import entities.vector_4;

public class program_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar?");

		int N = sc.nextInt();

		vector_4 vect[] = new vector_4[N];

		for (int i = 0; i < vect.length; i++) {
			System.out.println("");
			System.out.print("Digite um número: ");
			double number = sc.nextDouble();
			vect[i] = new vector_4(number);
		}

		System.out.println("NÚMEROS PARES: ");

		sc.close();
	}

}
