import java.util.Locale;
import java.util.Scanner;

public class estruturaRepeticaoFor_exercicio_4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N;
		double x, y;
		//double resultado;
		
		N = sc.nextInt();
		
		for(int i=0;i<N;i++) {
			x = sc.nextDouble();
			y = sc.nextDouble();
			
			if(y==0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(x/y);
			}
			
			
		}
		
		
		sc.close();
	}

}
