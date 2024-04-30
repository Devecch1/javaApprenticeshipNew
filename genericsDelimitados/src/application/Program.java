package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();										// CRIADA UMA LISTA DE PRODUTOS
		
		String path = "C:\\Users\\bruno.devecchi\\Documents\\in.txt";				// DEFININDO CAMINHO DO ARQUIVO
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){			// ABRINDO ARQUIVO
			
			String line = br.readLine();											// LENDO TODAS AS LINHAS DO ARQUIVO
			while( line != null) {				
				String[] fields = line.split(";");									// CRIO UM VETOR FIELDS RECEBENDO A LINHA DO ARQUIV DELIMITANDO PELO CARACTER ";"
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));	// INSTANCIO O MEU PRODUTO NA COLUNA 0 E PREÇO NA 1
				line = br.readLine();												
			}
			
			Product x = CalculationService.max(list);								// ENCONTRAR O MAIOR ELEMENTO DA MINHA LISTA			
			System.out.println("MAX:");
			System.out.println(x);
		} catch	(IOException e) {
			System.out.println("ERROR: " + e.getMessage());
		}

		
	}

}
