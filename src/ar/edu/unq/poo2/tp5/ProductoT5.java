package ar.edu.unq.poo2.tp5;

public class ProductoT5 {

	private String nombre;
	private double precio;
	private int cantidad;
	
	public ProductoT5(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
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
	
	public int getCantidad(){
		return cantidad;
	}
	
	public void setCantidad(int cantidad) {
		this.cantidad= cantidad;
	}

	
	
	
	
	
}
