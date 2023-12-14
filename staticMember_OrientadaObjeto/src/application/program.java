package application;

import java.util.Locale;
import java.util.Scanner;

import utility.calculator;

public class program {

	// public static final double PI = 3.14; // O FINAL É O O VALOR CONSTANTE, UMA VEZ ATRIBUIDO NAO MUDA // E O PI É A CONSTANTE
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		//calculator calc = new calculator(); // É NECESSÁRIO INSTANCIAR O OBJETO "calc" QUANDO O MÉTODO STATIC SE ENCONTRA EM OUTRA CLASSE
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = calculator.circumference(radius); // NAO POSSO CHAMAR UM MÉTODO NÃO ESTATICO DENTRO DE UM METODO ESTATICO
		
		double v = calculator.volume(radius); // NAO POSSO CHAMAR UM MÉTODO NÃO ESTATICO DENTRO DE UM METODO ESTATICO
		
		System.out.printf("Circumference = %.2f%n", c);
		System.out.printf("Volume = %.2f%n", v);
		System.out.printf("PI Value = %.2f%n", calculator.PI);
		
		sc.close();
	}

	//public static double circumference(double radius) {
	//	return 2.0 * PI * radius;
	//}
	
	//public static double volume(double radius) {
	//	return 4.0 * PI * radius * radius * radius / 3.0;
	//}

}
