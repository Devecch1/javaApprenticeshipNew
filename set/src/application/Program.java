package application;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");
		set.add("Iphone");
		set.add("PC");
		
		System.out.println(set.contains("Notebook"));
		
		set.remove("TV"); // VAI REMOVER O TV DO CONJUNTO
		set.removeIf(x -> x.length() >= 3); // REMOÇÃO COM A CLAUSULA IF
		
		for(String p: set) {
			System.out.println(p);
				
			}
		}

	}


// ELE DEU TRUE, POIS O PRODUTO NOTABOOK CONSTA NO CONJUNTO
// SE OBSERVAR O HASHSET ELE É MAIS RÁPIDO, PORÉM ELE NÃO DEVOLVE O RESULTADO NA ORDEM
// SE EU SUBSTITUIR O HASHSET PELO TREESET, ELE VAI ME DEVOLVER NA ORDEM
// O LINKEDHASHSET RETORNA OS ITENS NA MESMA ORDEM QUE FOI INSERIDO