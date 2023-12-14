import java.util.Scanner;

public class estruturaRepeticaoFor_exercicio_2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N, X, somaIn, somaOut;

		N = sc.nextInt();

		somaIn = 0;
		somaOut = 0;

		for (int I = 1; I <= N; I++) {
			X = sc.nextInt();
			if (X >= 10 && X <= 20) {
				somaIn = somaIn + 1;

			} else {
				somaOut = somaOut + 1;
			}
		}

		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");

		sc.close();
	}

}
