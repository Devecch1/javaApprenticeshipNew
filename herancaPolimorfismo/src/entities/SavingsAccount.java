package entities;

public class SavingsAccount extends Account{
// public final class SavingsAccount extends Account{	->>>> CASO EU NÃO QUEIRA QUE ELA SE TORNE MAIS UMA HERANÇA BASTA EU COLOCAR O FINAL

	private double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance  += balance * interestRate;
	}
	
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
