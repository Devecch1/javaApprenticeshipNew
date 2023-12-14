package application;

import java.util.Locale;
import java.util.Scanner;

import entities.aluno;

public class program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		aluno aluno = new aluno();
		
		System.out.print("NOME: ");
		aluno.aluno = sc.nextLine();
		System.out.print("Primeira Nota: ");
		aluno.first_nota = sc.nextDouble();
		System.out.print("Segunda Nota: ");
		aluno.second_nota = sc.nextDouble();
		System.out.print("Terceira Nota: ");
		aluno.third_nota = sc.nextDouble();
		
		System.out.println();
		System.out.println("FINAL GRADE: " + aluno.totalNotas());
		
		
		
		
		sc.close();
	}

}
