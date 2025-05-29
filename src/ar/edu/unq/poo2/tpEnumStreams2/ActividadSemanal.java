package ar.edu.unq.poo2.tpEnumStreams2;

public class ActividadSemanal {

	DiaDeLaSemana dia;
	int horaDeInicio;
	int duracion;
	Deporte deporte;
	
	
	public ActividadSemanal(DiaDeLaSemana dia, int horaDeInicio, int duracion, Deporte deporte) {
		super();
		this.dia = dia;
		this.horaDeInicio = horaDeInicio;
		this.duracion = duracion;
		this.deporte = deporte;
	}


	public DiaDeLaSemana getDia() {
		return dia;
	}


	public void setDia(DiaDeLaSemana dia) {
		this.dia = dia;
	}


	public int getHoraDeInicio() {
		return horaDeInicio;
	}


	public void setHoraDeInicio(int horaDeInicio) {
		this.horaDeInicio = horaDeInicio;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public Deporte getDeporte() {
		return deporte;
	}


	public void setDeporte(Deporte deporte) {
		this.deporte = deporte;
	}
	
	
	
	public float costo() {
		
		float costoComplejidad = this.getDeporte().getComplejidad() * 200;
		float costoPorDiaDeSemanaHabil = this.costoPorDia();
		return (costoComplejidad + costoPorDiaDeSemanaHabil);
	}


	private float costoPorDia() {
		if(this.getDia().isDiaDeSemanaHabil()) {
			return this.costoPorDiaDeSemanaHabil();
		}
		else {
			return this.costoPorDiaDeSemanaNoHabil();
		}
	}


	private float costoPorDiaDeSemanaHabil() {
		// TODO Auto-generated method stub
		return 500;
	}

	private float costoPorDiaDeSemanaNoHabil() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
	@Override
	public String toString() {
		/*
		ActividadSemanal actividad1 = new ActividadSemanal(Deporte.FUTBOL, "Futbol Adultos", 100.0);
		System.out.println(actividad1); // Salida: ActividadSemanal@1a2b3c4d (o similar, poco útil)
		*/
	    return "ActividadSemanal { " +
	            "deporte: " + deporte + 
	            ", costo=" + costo() +
	            '}';
	    /*
	     * 
ActividadSemanal actividad1 = new ActividadSemanal(Deporte.FUTBOL, "Futbol Adultos", 100.0);
System.out.println(actividad1); // Salida: ActividadSemanal{deporte=FUTBOL, nombre='Futbol Adultos', costo=100.0}
	     */
	}
}
