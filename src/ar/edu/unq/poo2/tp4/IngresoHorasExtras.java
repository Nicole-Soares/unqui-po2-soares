package ar.edu.unq.poo2.tp4;

public class IngresoHorasExtras extends Ingreso{
	
	private double horasExtras;

	public IngresoHorasExtras(String concepto, String mes, double monto, double horasExtras) {
		super(concepto, mes, monto);
		this.horasExtras = horasExtras;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}
	
	@Override
	public double montoImponible() {
		return 0;
	}

}
