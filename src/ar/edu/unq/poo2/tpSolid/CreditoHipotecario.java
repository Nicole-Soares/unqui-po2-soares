package ar.edu.unq.poo2.tpSolid;

public class CreditoHipotecario extends Credito {

	private Propiedad propiedad;
	
	public CreditoHipotecario(double cuotaMensual, Cliente cliente, double montoSolicitado, int plazo, Estado estado, Propiedad propiedad) {
		super(cliente, montoSolicitado, plazo, estado);
		this.propiedad = propiedad;
	}

	
	public Propiedad getPropiedad() {
		return propiedad;
	}


	public void setPropiedad(Propiedad propiedad) {
		this.propiedad = propiedad;
	}


	@Override
	protected boolean cumpleLaCondicion() {
		
		return this.montoCuotaNoSupera(50) && this.montoTotalSolicitadoNoMayorAlValorDeLaGarantia() && this.clienteNoSupereLaEdadLimiteAntesDeTerminarCuota(65);
	}

	private boolean clienteNoSupereLaEdadLimiteAntesDeTerminarCuota(int i) {
		int edadDelClienteAlFinalizarLasCuotas = this.getCliente().edad() + this.getPlazo();
		return edadDelClienteAlFinalizarLasCuotas <= 65;
	}


	private boolean montoTotalSolicitadoNoMayorAlValorDeLaGarantia() {
		
		double setentaPorcientoDeLaPropiedad = this.getPropiedad().getValorFiscal() * 70 / 100;
		return this.getMontoSolicitado() <= setentaPorcientoDeLaPropiedad ;
	}

	
	
	

}
