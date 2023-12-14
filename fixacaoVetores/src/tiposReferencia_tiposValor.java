import java.util.Locale;
import java.util.Scanner;

public class tiposReferencia_tiposValor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		//ele começa com o i = 0, depois ele ve se o i é menor que n, caso ele seja menor que o n ele pega o valor de i e soma com mais 1, e segue o "cursor"
		
		for(int i=0; i<n; i++) { 
			vect[i] = sc.nextDouble();
		}
		
		//aqui eu faço a soma de todas as alturas 
		
		double sum = 0.0;
		for(int i=0; i<n; i++) {
			sum +=vect[i];
		}
		
		//aqui eu pego a média do valor
		
		double avg = sum / n;
		
		System.out.printf("AVERAGE = %.2f%n", avg);
		
		sc.close();
	}

}
