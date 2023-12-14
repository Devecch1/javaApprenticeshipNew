import java.util.Locale;
import java.util.Scanner;

public class operadorAtribuicaoCumulativa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int minutos;
		double valorPagar;
		
		minutos = sc.nextInt();
		
		if(minutos > 100) {
			valorPagar = ((minutos - 100) * 2) + 50;
		} else {
			valorPagar = 50;
		}
		
		System.out.printf("Valor a pagar = R$ %.2f%n", valorPagar);
		
		sc.close();
	}

}
