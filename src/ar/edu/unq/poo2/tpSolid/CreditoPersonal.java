package ar.edu.unq.poo2.tpSolid;

public class CreditoPersonal extends Credito{

	
	public CreditoPersonal(Cliente cliente, double montoSolicitado, int plazo, Estado estado) {
		super(cliente, montoSolicitado, plazo, estado);
	}

	
	@Override
	protected  boolean cumpleLaCondicion() {
		return this.solicitanteTieneIngresosAnualesMayoresA(15000) && this.montoCuotaNoSupera(70);
		
	}
	
	


	private boolean solicitanteTieneIngresosAnualesMayoresA(int numero) {
		return this.getCliente().sueldoNetoAnual()>= 15000;
	}
}
