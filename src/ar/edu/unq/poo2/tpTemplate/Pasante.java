package ar.edu.unq.poo2.tpTemplate;

public class Pasante extends Empleado{

	public Pasante(float sueldoBasico, boolean esCasado, int cantidadDeHijos, int cantidadDeHorasTrabajadas) {
		super(sueldoBasico, esCasado, cantidadDeHijos, cantidadDeHorasTrabajadas);
		// TODO Auto-generated constructor stub
	}
	
	public float totalPorLasHorasTrabajadas() {
		return this.getCantidadDeHorasTrabajadas() * this.importeDeLaHora();
	}

	@Override
	public  int importeDeLaHora() {
		
		return 40;
	}
}
