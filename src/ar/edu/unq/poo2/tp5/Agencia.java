package ar.edu.unq.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Agencia implements AgenciaI{

	private List<Factura> facturasPagadas;

	public Agencia(List<Factura> facturasPagadas) {
		super();
		this.facturasPagadas = facturasPagadas;
	}

	public Agencia() {
		super();
		this.facturasPagadas = new ArrayList<Factura>();
	}

	
	public List<Factura> getFacturasPagadas() {
		return facturasPagadas;
	}

	public void setFacturasPagadas(List<Factura> facturasPagadas) {
		this.facturasPagadas = facturasPagadas;
	}
	
	public void registrarPago(Factura factura) {
		this.getFacturasPagadas().add(factura);
	}

	
}
