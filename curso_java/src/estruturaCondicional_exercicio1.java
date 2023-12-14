import java.util.Scanner;

public class estruturaCondicional_exercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		numero = sc.nextInt();
		
		
		if(numero >= 0 ) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		
		
		sc.close();
	}

}
