package ar.edu.unq.poo2.tp4;
import java.util.ArrayList;
import java.util.List;


public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> productos;
	
	public Supermercado(String nombre, String direccion, List<Producto> productos) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = productos;
	}
	
	//puede crearse con una lista vacia
	public Supermercado(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.productos = new ArrayList<Producto>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	public void setProducto(Producto p) {
		this.productos.add(p);
	}

	public Integer cantidadTotalDeProductos() {
		
		
		return this.productos.size();
	}

	public Double sumaTotalDeTodosLosProductos() {
		
		Double totalDeLosProductos = 0d;
		for(Producto producto:productos) {
			totalDeLosProductos=+ producto.getPrecio();
		}
		return totalDeLosProductos;
	}
	
	
	
	
}
