import java.util.Locale;
import java.util.Scanner;

public class doWhile_example {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// -------------------------------------------- MÉTODO 1
		// -------------------------------------------//

//		System.out.print("Digite a temperatura em Celcius: ");
//		
//		double C, F;
//		
//		C = sc.nextDouble();
//		F = ((9.0 * C) / 5.0) + 32.0;
//		
//		System.out.printf("Equivalente em Fahrenheint: %.2f%n", F);
//		
//		System.out.println("Deseja repetir (s/n)? ");
//		
//		char x;
//		
//		x = sc.next().charAt(0);
//		
//		while(x != 'n') {
//			System.out.print("Digite a temperatura em Celcius: ");
//			
//			C = sc.nextDouble();
//			F = ((9.0 * C) / 5.0) + 32.0;
//			
//			System.out.printf("Equivalente em Fahrenheint: %.2f%n", F);
//			
//			System.out.print("Deseja repetir (s/n)? ");
//			
//			x = sc.next().charAt(0);

//-------------------------------------------- MÉTODO 2 -------------------------------------------//

//		char x;
//
//		x = 's';
//
//		while (x != 'n') {
//			System.out.print("Digite a temperatura em Celcius: ");
//
//			double C, F;
//
//			C = sc.nextDouble();
//			F = ((9.0 * C) / 5.0) + 32.0;
//
//			System.out.printf("Equivalente em Fahrenheint: %.2f%n", F);
//
//			System.out.println("Deseja repetir (s/n)? ");
//
//			x = sc.next().charAt(0);
//
//		}

//------------------------------------------ MÉTODO DO WHILE -----------------------------------------//

		char x;

		do {
			System.out.print("Digite a temperatura em Celcius: ");
			
			double C, F;

			C = sc.nextDouble();
			F = ((9.0 * C) / 5.0) + 32.0;

			System.out.printf("Equivalente em Fahrenheint: %.2f%n", F);

			System.out.println("Deseja repetir (s/n)? ");

			x = sc.next().charAt(0);

		} while (x != 'n');

		sc.close();
	}

}
