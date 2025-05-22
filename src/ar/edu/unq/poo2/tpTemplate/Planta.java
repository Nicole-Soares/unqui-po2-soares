package ar.edu.unq.poo2.tpTemplate;

public class Planta extends Empleado{

	public Planta(float sueldoBasico, boolean esCasado, int cantidadDeHijos, int cantidadDeHorasTrabajadas) {
		super(sueldoBasico, esCasado, cantidadDeHijos, cantidadDeHorasTrabajadas);
		
	}

	@Override
	public int importeDeLaHora() {
		
		return 0;
	}

	@Override
	public float importePorEstarCasadoOConHijos() {
		
		return this.getCantidadDeHijos() * 150;
	}
}
