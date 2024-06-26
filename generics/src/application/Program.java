package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>(); // ESSE <> no final, se refere para indicar que ele esta instancioando um tipo GENERICS
		
		System.out.print("How many values? ");
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Values:");
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("FIRST: " + ps.first());
		
		sc.close();
	}

}
