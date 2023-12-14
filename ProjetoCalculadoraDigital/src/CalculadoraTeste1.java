import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste1 {

	// TESTES DE SOMA
	@Test
	public void testeSomar5com3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 8;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);

	}

	// TESTE DE MULTIPLICAR
	@Test
	public void testeMultiplicar5com3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 15;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.multiplicar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	// TESTE DE DIVIDIR
	@Test
	public void testeDividir10com5() {
		int variavel1 = 5;
		int variavel2 = 10;
		int resultadoEsperado = 2;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

	// TESTE DE SUBTRAIR
	@Test
	public void testeSubtrair5com3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 2;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}

}