package application;

import java.util.Scanner;

import model.entities.bankAccount;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			String holder = sc.next();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit =  sc.nextDouble();
			
			bankAccount account =  new bankAccount(number, holder, balance, withdrawLimit);
			
			
			System.out.print("Enter amount for withdraw: " );
			account.withdraw(sc.nextDouble());
			
			System.out.printf("New balance: " + account.getBalance());
			
		}
		catch(DomainException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}
