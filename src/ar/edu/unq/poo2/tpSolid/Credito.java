package ar.edu.unq.poo2.tpSolid;

public abstract class Credito {

	private double cuotaMensual;
	private Cliente cliente;
	private double montoSolicitado;
	private int plazo;
	private Estado estado;
	
	
	public Credito( Cliente cliente, double montoSolicitado, int plazo, Estado estado) {
		super();
		
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.plazo = plazo;
		this.estado = estado;
	}




	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public double getMontoSolicitado() {
		return montoSolicitado;
	}



	public void setMontoSolicitado(double montoSolicitado) {
		this.montoSolicitado = montoSolicitado;
	}



	public int getPlazo() {
		return plazo;
	}



	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}


	public Estado getEstado() {
		return estado;
	}
	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public  void evaluarEstadoDelCredito() {
		Aprobado aprobado = new Aprobado();
		Desaprobado desaprobado = new Desaprobado();
		if(this.cumpleLaCondicion()) {
			this.setEstado(aprobado);
		}
		else {
			this.setEstado(desaprobado);
		}
	}


	protected abstract boolean cumpleLaCondicion();



	public double montoOtorgado() {
		
		return this.getEstado().montoOtorgado(this);
	}
	
	public double montoDeLaCuotaMensual() {
		return this.getMontoSolicitado() / this.getPlazo();
	}
	
	protected boolean montoCuotaNoSupera(int porcentaje) {
		
		Cliente cliente = this.getCliente();
		double setentataPorcientoDeSuSueldo = (porcentaje * cliente.getSueldoNeto()) / 100 ;
		
		return (this.getMontoSolicitado() <= setentataPorcientoDeSuSueldo);
	}

}
