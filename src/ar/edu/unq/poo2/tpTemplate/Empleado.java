package ar.edu.unq.poo2.tpTemplate;

public  abstract class Empleado {

	private float sueldoBasico;
	private boolean esCasado;
	private int cantidadDeHijos;
	private int cantidadDeHorasTrabajadas; 
	
	//clase abstracta la que tiene el esqueleto
	
	public Empleado(float sueldoBasico, boolean esCasado, int cantidadDeHijos, int cantidadDeHorasTrabajadas) {
		super();
		this.sueldoBasico = sueldoBasico;
		this.esCasado = esCasado;
		this.cantidadDeHijos = cantidadDeHijos;
		this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
	}


	public float getSueldoBasico() {
		return sueldoBasico;
	}


	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}


	public boolean isEsCasado() {
		return esCasado;
	}


	public void setEsCasado(boolean esCasado) {
		this.esCasado = esCasado;
	}


	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}


	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}
	
	
	
	public int getCantidadDeHorasTrabajadas() {
		return cantidadDeHorasTrabajadas;
	}


	public void setCantidadDeHorasTrabajadas(int cantidadDeHorasTrabajadas) {
		this.cantidadDeHorasTrabajadas = cantidadDeHorasTrabajadas;
	}


	public float sueldo() {
		
		float sueldoBrutoSinDescuento = this.getSueldoBasico() + this.totalPorLasHorasTrabajadas() + this.importePorEstarCasadoOConHijos();
		
		System.out.print(this.totalPorLasHorasTrabajadas());
		float sueldoBrutoConDescuento = sueldoBrutoSinDescuento - ( sueldoBrutoSinDescuento *  this.descuentoPorObraSocial() / 100);
		return sueldoBrutoConDescuento;
	}


	public float descuentoPorObraSocial() {
		
		return 13;
	}


	public float importePorEstarCasadoOConHijos() {
		// TODO Auto-generated method stub
		return 0;
	}


	public float totalPorLasHorasTrabajadas() {
		//metodo hook
		return 0;
	}
	
   protected abstract int importeDeLaHora();

	
}
