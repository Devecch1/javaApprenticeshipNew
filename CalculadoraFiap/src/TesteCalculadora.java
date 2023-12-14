import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class TesteCalculadora extends TestCase {
	/**
	 * Teste de somar na Calculadora.
	 */
	@Test
	public void testeSomar() {
		int nro1 = 5;
		int nro2 = 5;
		Calculadora calc = new Calculadora();
		int resultadoEsperado = 10;
		int resultadoReal = calc.somar(nro1, nro2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
}

public class TesteCalculadora extends TestCase {
	/***

	Teste de
	subtrair na Calculadora.*/

	@Test
	public void testeSubtrair() {
	int nro1 = 5;
	int nro2 = 3;
	Calculadora calc = new Calculadora();
	int resultadoEsperado= 2;
	int resultadoReal= calc.subtrair(nro1, nro2);

	assertEquals(resultadoEsperado resultadoReal);
	}
}

public class TesteCalculadora extends TestCase {
	/***

	Teste de
	multiplicar na Calculadora.*/

@Test
public void testeMultiplicar() {
int nro1 = 3;
int nro2 = 3;Ï
Calculadora calc = new Calculadora();
int resultadoEsperado = 9;
int resultadoReal = calc.multiplicar(nro1, nro2);
assertEquals(resultadoEsperado, resultadoReal);
}
}
