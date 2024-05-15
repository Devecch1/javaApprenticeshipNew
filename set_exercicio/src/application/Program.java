package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entitity.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter file full path: ");							// SOLICITANDO LER CAMINHO DO ARQUIVO
		String path = sc.nextLine();				 							// DIGITANDO NOME DO ARQUIVO
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){		// ABRINDO AQUIVO COM BASE NO DIGITADO
			
			Set<LogEntry> set = new HashSet<>();								// HASHSET MAIS RAPIDO POREM NAO ORDENA
			
			String line = br.readLine();										// GUARDO A LEITURA DENTRO DO LINE
			
			while(line != null) {												// ENQUANTO A LINHA FOR DIFERENTE DE NULL ELA PODE SEGUIR
				
				String[] fields = line.split(" ");								// DELIMITO CADA COLUNA E LINHA PELO ESPAÇO EM BRANCO
				String username = fields[0];									// CRIO A VARIAVEL USERNAME DEFININDO QUE O USERNAME ESTA NA POSIÇÃO 0(OU SEJA, A PRIMEIRA)
				Date moment = Date.from(Instant.parse(fields[1]));				// AJUSTO O FORMATO DE DATA/HORA E DEFINO QUE ESSA DATA ESTA BA POSIÇÃO 1
			
				set.add(new LogEntry(username, moment));						// INSERINDO O USERNAME E MOMENT QUE VEIO DO ARQUIVO NO SET LOGENTRY QUE FOI CRIADO
				
				line = br.readLine();											// AGORA MANDO LER A PRÓXIMA LINHA ATÉ QUE ELE ENCONTRE UMA LINHA NULA COMO PEDE O WHILE
			}
			
			System.out.println("Total users: " + set.size());
			
		} catch(IOException e){
			System.out.println("Error: " + e.getMessage());						// CASO NÃO ABRA, SUBIR MENSAGEM DE ERRO
		}
				
		sc.close();
	}

}
