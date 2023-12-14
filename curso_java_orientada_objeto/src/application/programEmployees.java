package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employees;

public class programEmployees {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		entities.employees employees = new employees();
		
		System.out.print("Nome: ");
		employees.name = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		employees.grossSalary = sc.nextDouble();
		
		System.out.print("Imposto: ");
		employees.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employees.name + ", " + "$" + " " + employees.netSalary());
		
		sc.close();
	}

}
