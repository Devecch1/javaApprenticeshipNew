import java.util.Scanner;

public class Exercicio_estrutura_repetitiva_for_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		
		System.out.println("Digite o valor escolhido:");
		x = sc.nextInt();
		
		for(int i=1; i<=x; i++) {
			if(i % 2 != 0) {
				System.out.println("Os valores impares que vem antes do valor são: " + i);
			}
		}

		sc.close();
	}

}
