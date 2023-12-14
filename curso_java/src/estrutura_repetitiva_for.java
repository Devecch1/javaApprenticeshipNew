import java.util.Scanner;

public class estrutura_repetitiva_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int N ,soma, x;
		
		System.out.println("Digite o índice ");
		N = sc.nextInt();
		soma = 0;
		
			for(int i=0; i<N; i++) {
				System.out.println("Digite o número de índice "+ i);
				x = sc.nextInt();
				soma += x;
			}
			
			System.out.println("A soma é " + soma);
		
		sc.close();
	}

}
