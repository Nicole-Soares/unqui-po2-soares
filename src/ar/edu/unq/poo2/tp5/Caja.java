package ar.edu.unq.poo2.tp5;

import java.util.List;

public class Caja {

	private Mercado mercado;
	
	public Caja(Mercado mercado) {
		super();
		this.mercado = mercado;
	}
	
	public Mercado getMercado() {
		return mercado;
	}
	
	public void setMercado(Mercado mercado) {
		this.mercado= mercado;
	}
	public double totalDeTodosLosProductos(List<ProductoT5> listaDeProductos) {
		
		double total =0;
		for(ProductoT5 producto: listaDeProductos) {
			total+=producto.getPrecio();
			this.getMercado().descontarUnoDelProducto(producto);
		}
		return total;
		
	}
	
	public void cobrarTodosLosProductos(List<ProductoT5> listaDeProductos) {
		
		for(ProductoT5 producto: listaDeProductos) {
			
			this.getMercado().descontarUnoDelProducto(producto);
		}
		
	}
	
	public void cobrarTodasLasFacturas(List<Factura> listaDeFacturas) {
			
			for(Factura factura: listaDeFacturas) {
				
				this.getMercado().registrarPago(factura);
			}
			
		}
	
}
