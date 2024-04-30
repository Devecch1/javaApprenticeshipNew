package services;

import java.util.List;

public class CalculationService {

	public static <T extends Comparable <T>> T max(List<T> list) {  	// OPERAÇÃO RECEBENDO UMA LISTA DE GENERICS(T)
		if(list.isEmpty()) {											// UM IF PARA CASO A LISTA SEJA VAZIA, TENHA UM EXCEPTION INFORMANDO ...
			throw new IllegalStateException("List can't be empty"); 	// ... QUE A LISTA NÃO PODE SER VAZIA
		}
		T max = list.get(0);											// CRIO A VARIÁVEL MAX RECEBENDO O LIST.GET0 QUE É O PRIMEIRO ELEMENTO DA LISTA
		for(T item: list) {
			if(item.compareTo(max)> 0) {								// SE O ITEM FOR MAIOR QUE O ITEM DA LISTA ELE VAI ATUALIZAR PARA ELE
				max = item;
			}
		}
		return max;
	}

}

// PRECISO ESPECIFICAR QUE O TIPO T É DE UM TIPO COMPARABLE, PARA EU FALAR ENTÃO QUE O T É UM TIPO COMPARABLE, EU INCLUO NO T UM "EXTENDS COMPARABLE <T>"