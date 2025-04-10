package ar.edu.unq.poo2.tp3;

import java.time.LocalDate;

public class Persona {

	private String nombre;
	private LocalDate fecha;
	
	public Persona(String nombre, LocalDate fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
	}
	
	 // Método de creación estático (de clase), es una alternativa a usar directamente el constructor y oculta la implementacion del constructor
    public static Persona crearPersona(String nombre, LocalDate fechaNacimiento) {
        return new Persona(nombre, fechaNacimiento);
    }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	public int edad() {
		
		LocalDate fechaActual = LocalDate.now();
		int añoActual = fechaActual.getYear();
		return(añoActual - this.getFecha().getYear());
	}
	
	public boolean menorQue(Persona persona) {
	
		return(this.edad() < persona.edad());
	}
}
