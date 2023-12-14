package application;

import java.util.Locale;
import java.util.Scanner;

import utility.calculator;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		calculator.dolarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		calculator.dolarBuy = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais? %.2f%n", calculator.real());
		
		sc.close();
	}

}
