package trabalhandoArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

public class LendoArquivo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		String path = "C:\\Users\\bruno.devecchi\\Documents\\zBruno\\arquivo.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error:" + e.getMessage());
		}

		String[] lines = new String[] {"C:\\Users\\bruno.devecchi\\Documents\\zBruno\\arquivo.csv"};
		
		String path1 = "C:\\Users\\bruno.devecchi\\Documents\\zBruno\\out.txt";
	}

	// Prosseguir depois
}
