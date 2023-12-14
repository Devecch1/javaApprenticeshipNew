import java.util.Locale;
import java.util.Scanner;

public class estruturaSequencial_exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		/*int codigo = sc.nextInt();*/
		int quantidade = sc.nextInt();
		double preco = sc.nextDouble();
		
		/*int codigo2 = sc.nextInt();*/
		int quantidade2 = sc.nextInt();
		double preco2 = sc.nextDouble();
		
		double valorPagar = (quantidade * preco) + (quantidade2 * preco2);
		
		System.out.printf("O VALOR A PAGAR = R$ %.2f%n", valorPagar);
		
		sc.close();
	}

}
