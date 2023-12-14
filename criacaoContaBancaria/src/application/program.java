package application;

import java.util.Locale;
import java.util.Scanner;

import entities.user;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		user user;
		
		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);						// AQUI ELE DIZ SE É VERDADEIRO OU FALSO
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			user = new user(numberAccount, holder, initialDeposit);
		} else {
			user = new user(numberAccount, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		user.deposit(deposit);
		
		System.out.println();
		System.out.println("Update data:");
		System.out.println(user);
		
		System.out.println();
		System.out.print("Enter a Withdraw value: ");
		double withdraw = sc.nextDouble();
		user.withdraw(withdraw);
		
		System.out.println("Update data: ");
		System.out.println(user);
		
		
		sc.close();
	}

}
