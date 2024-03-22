package CalcoloAreaEAltezza;

import java.io.IOException;

public class Calcolo {
	
	CalcoloBaseEAltezzaInterface interfaccia;
	
	public Calcolo(CalcoloBaseEAltezzaInterface interfaccia) {
		this.interfaccia = interfaccia;
	}
	
	public double calcoloArea() throws IOException {
		return this.interfaccia.calcoloArea();
	}
}
