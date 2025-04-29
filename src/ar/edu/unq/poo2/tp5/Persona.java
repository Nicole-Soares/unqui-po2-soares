package ar.edu.unq.poo2.tp5;

import java.time.LocalDate;
import java.util.function.BooleanSupplier;


public class Persona implements Item{

	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int edad() {
		LocalDate fechaActual = LocalDate.now();
		return (fechaActual.getYear()) - ((this.getFechaDeNacimiento()).getYear()) ;
	}

	public boolean esMenorQue(Persona persona) {
		
		return (this.edad() < persona.edad());
	}
	
	
	
}
