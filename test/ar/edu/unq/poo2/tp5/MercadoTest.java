package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class MercadoTest {

	private ProductoT5 arroz;
	private ProductoT5 detergente;
	private Mercado mercado;
	private Agencia agencia;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoT5("Arroz", 18.9d, 1);
		detergente = new ProductoT5("Detergente", 75d, 1);
		agencia = new Agencia();
		mercado = new Mercado(agencia);
		
	}
	
	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, mercado.cantidadTotalDeProductos());
		mercado.agregarUnProducto(arroz);
		mercado.agregarUnProducto(arroz);
		assertEquals(1, mercado.cantidadTotalDeProductos());
	}
	
	@SuppressWarnings("removal")
	@Test
	public void testPrecioTotal() {
		assertEquals(new Double(0), mercado.sumaTotalDeTodosLosProductos());
		mercado.agregarUnProducto(arroz);
		mercado.agregarUnProducto(detergente);
		assertEquals(new Double(93.9), mercado.sumaTotalDeTodosLosProductos());
	}
	
}
