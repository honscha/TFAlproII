package pucrs.alpro2.br.tf;

import pucrs.alpro2.br.listTAD.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {
	private Path path1 = Paths.get("C:/Users/Tiago/Documents/acidentes.csv");
	private LinkedList<Acidente> lista = new LinkedList<Acidente>();

	public LinkedList<Acidente> lerArquivo() {
		try (BufferedReader reader = Files.newBufferedReader(path1,
				Charset.defaultCharset())) {
			String line = null;
			String[] splittedLine = null;
			int i = 0;
			while ((line = reader.readLine()) != null) {
				if(i != 0){
					splittedLine = line.split(";");
					Acidente acid = new Acidente(splittedLine[0],
							splittedLine[1], splittedLine[2], splittedLine[3],
							Integer.parseInt(splittedLine[4]), Integer.parseInt(splittedLine[5]), Integer.parseInt(splittedLine[6]),
							Integer.parseInt(splittedLine[7]), Integer.parseInt(splittedLine[8]), Integer.parseInt(splittedLine[9]),
							Integer.parseInt(splittedLine[10]), Integer.parseInt(splittedLine[11]), Integer.parseInt(splittedLine[12]),
							Integer.parseInt(splittedLine[13]), Integer.parseInt(splittedLine[14]), Integer.parseInt(splittedLine[15]),
							splittedLine[16], splittedLine[17], splittedLine[18]);
					lista.add(acid);
				}
				i++;
			}

		} catch (IOException x) {
			System.err.format("Erro de E/S %s%n", x);
		}
		return lista;
	}
}
