package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class ProductoCooperativoTest {


	private ProductoDeCooperativa leche;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoDeCooperativa("Leche", 8d,1);
	}
	
	@SuppressWarnings("removal")
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
}
