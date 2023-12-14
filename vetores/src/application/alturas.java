package application;

import java.util.Locale;
import java.util.Scanner;

import entities.alturas_entities;

public class alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas serão digitadas?");
		
		int n = sc.nextInt();
		
		alturas_entities vect[] = new alturas_entities[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.println("Dados da pessoa: ");
			String name = sc.nextLine();
			double age = sc.nextInt();
			double height = sc.nextDouble();
			vect[i] = new alturas_entities(name, age, height); 
			
		}
		
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += vect[i].getHeight();
		}
		
		double avg = sum / n;
		
		System.out.printf("Altura média: %.2f%n", avg);
		
		double nmenores = 0;
		
		for(int i=0; i<n; i++) {
			if(vect[i].getAge() < 16) {
				nmenores += 1;
			}
		}
		
		double x = n;
		
		double perc = (nmenores/x) * 100;
		
		System.out.printf("Pessoas com menos de 16 anos: %.2f%n", perc);
		
		sc.close();
	}

}

//teste2
