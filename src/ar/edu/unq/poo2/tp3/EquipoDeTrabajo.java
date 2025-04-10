package ar.edu.unq.poo2.tp3;

import java.time.LocalDate;
import java.util.ArrayList;

public class EquipoDeTrabajo {

	
	private String nombre;
	private ArrayList<Persona> integrantes;
	
	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
		super();
		this.nombre = nombre;
		this.integrantes = integrantes;
	}
	
	 public static EquipoDeTrabajo crearEquipoDeTrabajo(String nombre, ArrayList<Persona> integrantes) {
	        return new EquipoDeTrabajo(nombre, integrantes);
	    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Persona> getIntegrantes() {
		return integrantes;
	}

	public void setIntegrantes(ArrayList<Persona> integrantes) {
		this.integrantes = integrantes;
	}

	public int promedioDeEdadDeLosIntegrantes() {

		ArrayList<Persona>listaEmpleados = this.getIntegrantes();
		int sumaDeEdades = 0;
		
		 if (listaEmpleados.isEmpty()) {
	            return 0; // Manejar el caso de equipo sin integrantes
	        };
	        
		for(Persona empleado:listaEmpleados) {
			sumaDeEdades+= empleado.edad();
			
		}
		return sumaDeEdades / this.getIntegrantes().size();
	}
	
	 
}
