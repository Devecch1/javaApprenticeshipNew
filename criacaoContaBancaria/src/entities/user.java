package entities;

public class user {

	private int numberAccount;
	private String holder;
	private double balance;
	
	
	public user(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	}
	

	public user(int numberAccount, String holder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposit(initialDeposit); // CRIEI ISSO PARA PROTEGER MEU CONSTRUTOR DE MUDANÇAS FUTURAS, COMO ALTERAÇAO DE TAXA
	}

	
	

	public int getNumberAccount() {
		return numberAccount;
	}


	public String getHolder() {
		return holder;
	}


	public void setHolder(String holder) {
		this.holder = holder;
	}


	public double getBalance() {
		return balance;
	}

// MANTIVE SOMENTE OS GET DE NUMERO DA CONTA E SALDO, POIS ELES NÃO PODEM SER ALTERADOS, SOMENTE O NOME PODE SER ALTERADO POR ISSO TEM SET.

	public void deposit(double amount) { // O AMOUNT É O VALOR INSERIDO, SE VOU FAZER UM DEPÓSITO SOMO ELE + MEU SALDO
		balance += amount;
	}
	
	public void withdraw(double amount) { // O AMOUNT É O VALOR INSERIDO, SE VOU FAZER UMA RETIRADA SUBTRAIO ELE - MEU SALDO
		balance -= amount + 5.0; // TEM +5 POIS É A TAXA DO BANCO PRA SACAR
	}
	
	public String toString() {
		return "Account "
				+numberAccount
				+" , Holder: "
				+holder
				+" , Balance: $ "
				+String.format("%.2f", balance);
	}
}
