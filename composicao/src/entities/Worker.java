package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entites.enums.WorkerLevel;

public class Worker {

	private String name;						// ATRIBUTOS BASICOS
	private WorkerLevel level;					// ATRIBUTOS BASICOS
	private Double baseSalary;					// ATRIBUTOS BASICOS
	
	private Department department;				// ISSO SAO ASSOCIAÇOES
	private List<HourContract> contracts = new ArrayList <>();		// COMO SÃO VARIOS CONTRATOS, PRECISO REPRESENTAR POR UMA LISTA
	
	public Worker() { // CONSTUTOR VAZIO
		
	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {	
		super();
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}

	// QUANDO MINHA ASSOCIAÇÃO FOR UMA LISTA PRECISO RETIRAR ELA DO CONSTRUTOR E INICIAR ELA ZERADA COM O ARRAY
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	//public void setContracts(List<HourContract> contracts) {
	//	this.contracts = contracts;
	//}
	////// ESTOU REMOVENDO ELA PORQUE ELA ATRAPALHA NA CRIAÇAO DE ADIÇAO OU REMOÇAO DE CONTRATOS //////
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public void removeContract(HourContract contract) {
		contracts.add(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
