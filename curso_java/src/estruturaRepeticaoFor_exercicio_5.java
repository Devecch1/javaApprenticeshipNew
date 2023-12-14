import java.util.Scanner;

public class estruturaRepeticaoFor_exercicio_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		N = sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			System.out.println(N*(N-1)*(N-2)*(N-3)*1);
		}
		
		sc.close();
	}

}
