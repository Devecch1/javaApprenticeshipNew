package application;

import java.util.Locale;
import java.util.Scanner;

import entities.rectangle;

public class programRectangle {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		entities.rectangle rectangle = new rectangle();
		
		System.out.print("Ler altura do Retangulo: ");
		rectangle.height = sc.nextDouble();
		
		System.out.print("Ler comprimento do Retangulo: ");
		rectangle.width = sc.nextDouble();
		
		System.out.println("AREA = " + rectangle.area());
		System.out.println("DIAGONAL = " + rectangle.diagonal()); 
		System.out.println("PERIMETRO = " + rectangle.perimeter());
		
		sc.close();
	}

}
