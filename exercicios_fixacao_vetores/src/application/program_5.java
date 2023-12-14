package application;

import java.util.Locale;
import java.util.Scanner;

//import entities.vector_5; -- Não tem porque criar

public class program_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		
		int N= sc.nextInt();
		
		int[] vect = new int[N];
		
		for(int i=0; i<vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números Negativos: ");
		
		for(int i=0; i<vect.length; i++) {
		if(vect[i] < 0){
			System.out.println(vect[i]);
		}
		}
		
		sc.close();
	}

}
