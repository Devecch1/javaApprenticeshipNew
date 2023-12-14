import java.util.Scanner;

public class estruturaCondicional_exercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		valor1 = sc.nextInt();
		valor2 = sc.nextInt();
		
		if(valor2 % valor1 == 0 || valor1 % valor2 == 0 ) {
			System.out.println("SÃO MULTIPLOS");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		
		
		sc.close();
	}

}
