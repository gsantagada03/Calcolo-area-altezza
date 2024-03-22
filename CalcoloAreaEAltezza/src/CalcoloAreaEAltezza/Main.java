package CalcoloAreaEAltezza;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		CalcoloBaseEAltezzaInterface interfaccia = new ClasseFile();
		Calcolo calcolo = new Calcolo(interfaccia);
		System.out.println(calcolo.calcoloArea());
		CalcoloBaseEAltezzaInterface classeFile = new CalcoloArea();
		Calcolo calcolo1 = new Calcolo(classeFile);
		System.out.println(calcolo1.calcoloArea());
		
		
	}
}
