package ar.edu.unq.poo2.tp5;
import ar.edu.unq.poo2.tp5.Factura; 

public class Impuesto implements Factura {
	
	private double montoAPagar;

	public Impuesto(double montoAPagar) {
		super();
		this.montoAPagar = montoAPagar;
	}

	public double getMontoAPagar() {
		return montoAPagar;
	}

	public void setMontoAPagar(double montoAPagar) {
		this.montoAPagar = montoAPagar;
	}
	
	

	public double montoTotal() {
		return this.getMontoAPagar();
	}
}
