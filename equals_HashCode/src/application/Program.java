package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Bruno", "bruno@gmail.com");
		Client c2 = new Client("Xoxonho", "xoxonho@gmail.com");
		
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}

}
