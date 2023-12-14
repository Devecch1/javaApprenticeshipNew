import java.util.Locale;
import java.util.Scanner;


public class estruturaCondicional_exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int codigo;
		double qtd;
		double total;
		
		codigo = sc.nextInt();
		qtd = sc.nextDouble();
		
		if(codigo == 1) {
			total = qtd * 4.00;
		} else if (codigo == 2){
			total = qtd * 4.50;
		} else if (codigo == 3) {
			total = qtd * 5.00;
		} else if (codigo == 4) {
			total = qtd * 2.00;
		} else {
			total = qtd * 1.50;
		}
	
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}

}
