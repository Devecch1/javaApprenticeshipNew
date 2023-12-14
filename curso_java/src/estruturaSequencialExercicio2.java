import java.util.Locale;
import java.util.Scanner;

public class estruturaSequencialExercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		double pi = 3.14159;
		double x = sc.nextDouble();
		double raio = x * x;
		double area = pi * raio;
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
	}

}
