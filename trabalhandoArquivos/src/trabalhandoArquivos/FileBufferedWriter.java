package trabalhandoArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Criação do módulo", "Criação Segundo Módulo"};
		
		String path = "C:\\Users\\bruno.devecchi\\Documents\\zBruno\\TesteArquivoCriacaoJava.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			// SE EU QUISER QUE NÃO RECRIE O ARQUIVO E SÓ COMPLETE ELE NO (new FileWriter(path)) EU COLOCO
			// new FileWriter(path, true) QUE ELE NÃO RECRIA O ARQUIVO DO ZERO
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
