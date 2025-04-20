package ar.edu.unq.poo2.tp4;

public class Producto {

	private String nombre;
	private double precio;
	private boolean pertenecePrecioCuidado;
	
	
	public Producto(String nombre, double precio, boolean pertenece) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.pertenecePrecioCuidado = pertenece;
	}
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.pertenecePrecioCuidado = false;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public boolean esPrecioCuidado() {
		return pertenecePrecioCuidado;
	}


	public void setPertenecePrecioCuidado(boolean pertenecePrecioCuidado) {
		this.pertenecePrecioCuidado = pertenecePrecioCuidado;
	}

	public void aumentarPrecio(double d) {
		this.setPrecio(this.getPrecio() + d);
		
	}
	
	
	
	
}
