package ar.edu.unq.poo2.tp4;

public class Ingreso {

	private String concepto;
	private String mes;
	private double monto;
	
	public Ingreso(String concepto, String mes, double monto) {
		super();
		this.concepto = concepto;
		this.mes = mes;
		this.monto = monto;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	
	
	public double montoImponible() {
		return this.getMonto();
	}
}
