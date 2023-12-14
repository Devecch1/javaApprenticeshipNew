import java.util.Locale;

public class revisao_curso {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/*estrutura de int*/
		int y = 32;
		
		System.out.println(32);	
		
		/*estrutura de double*/
		double x = 14.33752;
		
		System.out.printf("%.2f%n",x);
		 
		/*estrutura com pitnln e print*/
		System.out.println("Bom dia Mundo!");
		System.out.println("Boa noite Mundo!");
		System.out.print("Vou dormir. ");
		System.out.println("Estou cansado");
		
		/*concatenar varios tipos de elementos*/
		System.out.println("Resultado obtido " + y + " pontos");
		
		/*concatenar printf*/
		System.out.printf("Resultado = %.2f%n", x);
	
		/*concatenar em massa*/
		String nome = "Maria";
		int idade = 35;
		double valor = 23.043;
		
		System.out.printf("O resultado saiu e %s possui %d anos com QI de %.2f porcento %n", nome, idade, valor);
		
		/*casting*/
		int a = 5;
		int b = 2;
		double resultado = (double) a / b ; 
		
		System.out.println(resultado);
	
	}

}
