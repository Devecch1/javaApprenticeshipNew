import java.util.Locale;
import java.util.Scanner;

public class expressaoCondicionalTernaria {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double preco;
		double desconto;

		preco = sc.nextDouble();

		desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.printf("O valor do desconto é %.2f%n", desconto);
		sc.close();

	}

}
