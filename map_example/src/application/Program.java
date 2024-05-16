package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String, String> cookies = new TreeMap<>(); 								  // VOU CHAMAR O MAP SENDO O PRIMEIRO STRING DA CHAVE E  O SEGUNDO DO VALOR
		
		cookies.put("username", "Bruno");  			   								  // A INSERÇÃO VAI CONTER O PRIMEIRO A CHAVE E O SEGUNDO O VALOR
		cookies.put("email", "Bruno@gmail.com");
		cookies.put("phone", "983362052");
		
		cookies.remove("email");					   								  // ESTOU REMOVEND DO MEU MAP A CHAVE DE EMAIL PARA RETORNAR SOMENTE OS OUTROS VALORES
		
		System.out.println("Constains 'phone' key: " + cookies.containsKey("phone")); // VERIFICANDO SE CONTEM A CHAVE QUE EU SOLICITEI
		System.out.println("Constains 'password' key:  " + cookies.containsKey("password"));
		
		System.out.println("Username: " + cookies.get("username"));					  // BUSCAR O VALOR DE UMA CHAVE - CASO NÃO EXISTE A CHAVE ELE RETORNARA COMO NULL
		
		System.out.println("Size: " + cookies.size());								  // CONTANDDO QTD DE CHAVES EXISTENTES
		
		System.out.println("ALL COOKIES");
		for(String key : cookies.keySet()) {										  // PEGANDO AS CHAVES DO MEU MAP EM FORMA DE SET cookies.keySet E TO PERCORRENDO PELO CONJUNTO E CHAMANDO ELE DE KEY 
			System.out.println(key + ":" + cookies.get(key));						  // O key É A CHAVE E O cookies.get(key) ÉO VALOR DA CHAVE
		}
		

	}

}
