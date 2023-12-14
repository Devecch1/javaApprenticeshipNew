import java.util.Locale;
import java.util.Scanner;

public class estruturaSequencial_exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		/*
		double largura, comprimento, area, valorMetro, metroQuadrado;
		
		largura = 10.0;
		comprimento = 30.0;
		valorMetro = 200.0;
		area = largura * comprimento;
		metroQuadrado = valorMetro * area;
		
		System.out.printf("O valor da area é: %.2f%n", area);
		System.out.printf("O preço ficou: %.2f do Metro", metroQuadrado);
		*/
		
		Scanner sc = new Scanner(System.in);
			
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = largura * comprimento;
		double preco = sc.nextDouble();
		double valorArea = preco * metroQuadrado;
		
		System.out.printf("O tamanho da area correspondente é de: %.2f%n", metroQuadrado);
		
		System.out.printf("O preço total é de R$ %.2f reais", valorArea);
		
		sc.close();
		
	}

}
