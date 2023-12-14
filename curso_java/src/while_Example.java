import java.util.Scanner;

public class while_Example {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x;
		int soma;
		
		x = sc.nextInt();
		soma = 0;
		
		while(x != 0) {
			soma += x;
			// mesma coisa que -> soma = soma + x;
			x = sc.nextInt();
		}
		
		System.out.println(soma);
		
		sc.close();
	}

}


// a regra imposta é enquanto "x" for diferente de zero, ele vai somar todos os numeros. 
// soma é igual a 0 porque ele entra como um valor vazio pra somar com o "x"
