
public class funcoesInteressantesParaString {

	public static void main(String[] args) {
		
		
		String original;
		
		original = "Bruno Devecchi ABC abc AbC aBc   ";
		System.out.println(original + "/-/");
		
		String s01 = original.toLowerCase(); // DIMINUIU TODAS AS LETRAS
		System.out.println(s01 + "/-/");
		
		String s02 = original.toUpperCase(); // AUMENTA TODAS AS LETRAS
		System.out.println(s02 + "/-/");
		
		String s03 = original.trim(); // MANTÉM O FORMATO ORIGINAL, PORÉM ELIMINANDO OS ESPAÇOS
		System.out.println(s03 + "/-/");
		
		String s04 = original.substring(2); // REMOVE A QUANTIDADE DE CARACTERES QUE EU DEFINIR QUE DEVEM SER REMOVIDOS (NESSE CASO DO INICIO AO FIM)
		System.out.println(s04 + "/-/");
		
		String s05 = original.substring(6, 14); // SELECIONANDO A QUANTIDADE DE CARACTERES A PARTIR DO NUMERO DE CASAS E NUMERO DE CARACTERES DO MEU INTERESSE
		System.out.println(s05);
		
		String s06 = original.replace('B','X'); // SUBSTITUI A LETRA INDICADA POR OUTRA STRING
		System.out.println(s06);
		
		int x = original.indexOf("bc"); // PRIMEIRA VEZ QUE APARECE
		System.out.println(x);
		
		int y = original.lastIndexOf("hi"); // ÚLTIMA VEZ QUE APARECE A PRIMEIRA LETRA
		System.out.println(y);
		
	}

}
