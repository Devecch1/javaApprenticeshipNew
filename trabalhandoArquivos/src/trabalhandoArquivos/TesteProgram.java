package trabalhandoArquivos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TesteProgram {

	public static void main(String[] args) {
		File file = new File("C:\\PASSO_A_PASSO_EMPRESAS 1.txt");

		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}

}
