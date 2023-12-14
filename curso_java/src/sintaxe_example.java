import java.util.Scanner;

public class sintaxe_example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int higher = max(a, b, c);

		showResult(higher); // TEM A FUNÇAO DE IMPRIMIR NA TELA A RESOLUÇAO DO HIGHER

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux; // VARIAVEL LOCAL DESSA FUNÇAO - VAI EXISTIR SOMENTE NESSA FUNÇAO

		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}

		return aux;
	}

	public static void showResult(int value){ // VOID É VAZIA // NO CASO ESSA PUBLIC DIZ QUE O RESOLTADO QUE ELA RETORNA É VAZIA
		
		System.out.println("HIGHER = " + value);
		
	}
}
