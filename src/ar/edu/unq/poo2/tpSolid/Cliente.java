package ar.edu.unq.poo2.tpSolid;

import java.time.LocalDate;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String direccion;
	private double sueldoNeto;
	private double montoADevolver;
	private LocalDate fechaDeNacimiento;
	
	

	public Cliente(String nombre, String apellido, String direccion, double sueldoNeto, double montoADevolver, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.sueldoNeto = sueldoNeto;
		this.montoADevolver = montoADevolver;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public Cliente(String nombre, String apellido, String direccion, double sueldoNeto, LocalDate fechaDeNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.sueldoNeto = sueldoNeto;
		this.montoADevolver = 0;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	

	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public double getSueldoNeto() {
		return sueldoNeto;
	}


	public void setSueldoNeto(double sueldoNeto) {
		this.sueldoNeto = sueldoNeto;
	}


	public double getMontoADevolver() {
		return montoADevolver;
	}


	public void setMontoADevolver(double montoADevolver) {
		this.montoADevolver = montoADevolver;
	}


	public double sueldoNetoAnual() {
		
		return (this.getSueldoNeto() * 12);
	}
 
	

	
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public int edad() {
		LocalDate ahora = LocalDate.now();
		return ahora.getYear() -this.getFechaDeNacimiento().getYear() ;
	}

}
