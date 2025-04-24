package ar.edu.unq.poo2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Mercado {

	private List<ProductoT5> listaDeProductos;
	private Agencia agencia;

	public Mercado(List<ProductoT5> listaDeProductos,Agencia agencia) {
		super();
		this.listaDeProductos = listaDeProductos;
		this.agencia = agencia;
	}
	
	public Mercado(Agencia agencia) {
		super();
		this.listaDeProductos = new ArrayList<ProductoT5>();
		this.agencia = agencia;
	}
	
	public List<ProductoT5> getListaDeProductos(){
		return this.listaDeProductos;
	}
	
	public Agencia getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}
	
	public void setListaDeProductos(List<ProductoT5> listaDeProductos) {
		this.listaDeProductos=listaDeProductos;
	}
	
	public void agregarUnProducto(ProductoT5 producto) {
		if(this.getListaDeProductos().contains(producto)) {
			this.aumentarCantidadEnUnoDelProducto(producto);
		}
		else {
			this.getListaDeProductos().add(producto);
		}
	}
	
	
	private void aumentarCantidadEnUnoDelProducto(ProductoT5 productoBuscado) {
		for(ProductoT5 producto:getListaDeProductos()) {
			if(productoBuscado.getNombre() == producto.getNombre()) {
				producto.setCantidad(producto.getCantidad() + 1);
			}
		}
	}

	public Integer cantidadTotalDeProductos() {
		
		return this.getListaDeProductos().size();
	}

	public void descontarUnoDelProducto(ProductoT5 producto) {
		for(ProductoT5 productoBuscado:getListaDeProductos()) {
			if(productoBuscado.getNombre() == producto.getNombre()) {
				producto.setCantidad(producto.getCantidad() - 1);
			}
		}
		
	}

	public Double sumaTotalDeTodosLosProductos() {
		
		double total=0;
		for(ProductoT5 producto:getListaDeProductos()) {
			
				total+=producto.getPrecio();
			
		}
		return total;
	}

	public void registrarPago(Factura factura) {
		this.getAgencia().registrarPago(factura);
		
		
	}
	
	
	
}
