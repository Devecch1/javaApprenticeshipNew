import java.util.Scanner;

public class forContagem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Valor de i = " + i);
		}
		
		System.out.println("");
		
		for(int x=4; x>=0; x--) {
			System.out.println("Valor de x = " + x);
		}
		
		sc.close();
	}

}
