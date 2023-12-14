import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class list_example {

	public static void main(String[] args) {
		
		// A Lista não aceita tipos primitivos, como "int", "double" e etc. É necessário usar o wrapper class como o Integer.
		// Se usa a ArrayList porque ela é muito otimizada, ela meio que pega as melhores caracteristicas do Vetor e da List
		
		List<String> list = new ArrayList<>(); 

		list.add("Maria"); // Para adicionar um elemento
		list.add("Alex"); 
		list.add("Moises"); 
		list.add("Bob"); 
		list.add("Ana"); 
		list.add(2, "Bruno"); // Adiciona no sequencial que eu quero que apareça
		
		System.out.println(list.size()); // Vejo o tamanho da lista
		System.out.println("");
		
		list.remove("Ana"); // Remover da lista pelo nome
		list.remove(1); // Remove da lista pelo sequencial
		list.removeIf(x -> x.charAt(0) == 'M'); // Remove através do predicado usando lambda
		
		
		System.out.println("");
		System.out.println("Index of Bruno: " + list.indexOf("Bruno")); // Para encontrar a posição de um elemento é o indexOf
		System.out.println("");
		
		// List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList()); // Defino qual inicial eu quero que puxe
		
		//String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null); // Puxa o primeiro nome da lista com o caractere
		
		for(String x : list) { // Faço o for each 
			System.out.println(x);
		}
	}

}
