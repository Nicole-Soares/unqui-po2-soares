package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgenciaTest {

	private ProductoT5 arroz;
	private ProductoT5 detergente;
	private Mercado mercado;
	private Agencia agencia;
	private Servicio servicio;
	private Caja caja;
	
	@BeforeEach
	public void setUp() {
		arroz = new ProductoT5("Arroz", 18.9d, 1);
		detergente = new ProductoT5("Detergente", 75d, 1);
		agencia = new Agencia();
		mercado = new Mercado(agencia);
		servicio = new Servicio(2, 100);
		caja = new Caja(mercado);
		
	}
	
/*	@Test
	public void testCantidadDeProductos() {
		assertEquals(0, mercado.cantidadTotalDeProductos());
		mercado.agregarUnProducto(arroz);
		mercado.agregarUnProducto(arroz);
		assertEquals(1, mercado.cantidadTotalDeProductos());
	}
	*/
	
	@Test
	public void testCantidadDeFacturasPagadas() {
		ArrayList<Factura> listaFacturas = new ArrayList<>();
		listaFacturas.add(servicio);
		//assertEquals(0, agencia.getFacturasPagadas().size());
		caja.cobrarTodasLasFacturas(listaFacturas);
		assertEquals(1, agencia.getFacturasPagadas().size());
	}
}
