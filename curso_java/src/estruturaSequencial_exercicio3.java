import java.util.Scanner;

public class estruturaSequencial_exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		int resultado = A * B - C * D;
		
		System.out.println("DIFERENCA = " + resultado);
		
		sc.close();
	}

}
