package entities;

public class employees {

	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return (grossSalary - tax);
	}
	
	public void increaseSalary(double percentage) {
		return ;
	}
	
}
