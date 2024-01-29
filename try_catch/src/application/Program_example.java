package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program_example {

	public static void main(String[] args) {

		method1();
	}

	
	public static void method1() {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("*** START METHOD1 ***");
		
		try {
			String vect[] = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid postion!");
			e.printStackTrace(); // STACK TRACE
		} catch (InputMismatchException e) {
			System.out.println("Input error!");
			e.printStackTrace();
		}
		
		System.out.println("");
		System.out.println("End of Program! :)");
		
		System.out.println("*** END METHOD1 ***");
		
		sc.close();
	}
}
