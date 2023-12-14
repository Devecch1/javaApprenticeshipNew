package entities;

public class aluno {

	public String aluno;
	public double first_nota;
	public double second_nota;
	public double third_nota;
	
	public double sumNotas() {
		return first_nota + second_nota + third_nota;
	}
	
	public String totalNotas() {
		if(sumNotas() < 60.0) {
			return 60.0 - sumNotas()
					+ " MISSED! YOU FAILLED!";
		} else {
			return "PASS";
		}
	}
}
