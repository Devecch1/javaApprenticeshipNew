public class Calculadora {
// Atributo
	private int resultado = 0;

// Método Somar
	public int somar(int n1, int n2) {
		resultado = n1 + n2;
		return resultado;
	}

// Método Subtrair
	public int subtrair(int n1, int n2) {
		resultado = n1 - n2;
		return resultado;
	}

// Método Multiplicar
	public int multiplicar(int n1, int n2) {
		resultado = n1 * n2;
		return resultado;
	}

// Método Dividir
	public int dividir(int n1, int n2) {
		resultado = n1 / n2;
		return resultado;
	}
}