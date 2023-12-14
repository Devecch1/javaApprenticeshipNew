import java.util.Scanner;

public class for_Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N, soma;
		
		N = sc.nextInt();
		soma = 0;
		
		for(int i=0; i<N; i=i+1) { //o i=i+1 pode ser substituido por i++
			int x = sc.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}
