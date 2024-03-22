package CalcoloAreaEAltezza;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ClasseFile implements CalcoloBaseEAltezzaInterface {
	
	String nomeTesto = "testo.txt";

	@Override
	public double calcoloArea() throws IOException {
		creaFile();
		String linea;
		BufferedReader reader = new BufferedReader(new FileReader(nomeTesto));
		double [] baseEAltezza = new double[2];
		int i = 0;
		while( (linea = reader.readLine())!= null) {
			baseEAltezza[i] = Double.parseDouble(linea);
			i++;

			
		}
		return baseEAltezza[0] * baseEAltezza [1] /2;
	}

	
	public static void creaFile() throws IOException {
		File fileDiTesto = new File("testo.txt");
		
		if(fileDiTesto.exists()) {
			System.out.println("file esistente");
		}else {
			System.out.println("file non esistente");
			fileDiTesto.createNewFile();
			BufferedWriter w = new BufferedWriter(new FileWriter("test.txt", true));
			w.write("10\r\n20");
			w.close();
			
			
		}
		
	}
	
}
