package ar.edu.unq.poo2.tpTemplate;

public class Temporario extends Empleado {

	public Temporario(float sueldoBasico, boolean esCasado, int cantidadDeHijos, int cantidadDeHorasTrabajadas) {
		super(sueldoBasico, esCasado, cantidadDeHijos, cantidadDeHorasTrabajadas);
		// TODO Auto-generated constructor stub
	}

	public float totalPorLasHorasTrabajadas() {
		return this.getCantidadDeHorasTrabajadas() * this.importeDeLaHora();
	}

	@Override
	public  int importeDeLaHora() {
		
		return 5;
	}

	@Override
	public float importePorEstarCasadoOConHijos() {
		
		if(this.isEsCasado() || (this.getCantidadDeHijos()> 0)) {
		return 100;
		}
	
		return 0;
	}
}
