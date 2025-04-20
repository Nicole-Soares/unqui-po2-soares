package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class TestSupermercado {


	private Producto arroz;
	private Producto detergente;
	private Supermercado supermercado;
	
	@BeforeEach
	public void setUp() {
		arroz = new Producto("Arroz", 18.9d, true);
		detergente = new Producto("Detergente", 75d);
		supermercado = new Supermercado("Lo de Tito", "Av Zubeldia 801");
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, supermercado.cantidadTotalDeProductos());
		supermercado.setProducto(arroz);
		supermercado.setProducto(detergente);
		assertEquals(2, supermercado.cantidadTotalDeProductos());
	}
	
	@SuppressWarnings("removal")
	@Test
	public void testPrecioTotal() {
		assertEquals(new Double(0), supermercado.sumaTotalDeTodosLosProductos());
		supermercado.setProducto(arroz);
		supermercado.setProducto(detergente);
		assertEquals(new Double(93.9), supermercado.sumaTotalDeTodosLosProductos());
	}
}
