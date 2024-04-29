package services;

import java.util.ArrayList;
import java.util.List;

public class PrintService {
		

	private List<Integer> list = new ArrayList<>(); // CRIANDO UMA LISTA DE INTEIROS
	
	public void addValue(Integer value) {
		list.add(value);
	}
	
	public Integer first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}
	
	
	public void print() {
		System.out.println("[");
		if(!list.isEmpty()) {
			System.out.println(list.get(0));
		}
		System.out.println("]");
	}
}
