package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {

	
	private Trabajador felipe;
	private Ingreso ingresoUno;
	private Ingreso ingresoExtra;
	
	@BeforeEach
	public void setUp() {
		felipe = new Trabajador();
		ingresoUno = new Ingreso("bono", "Junio", 75d);
		ingresoExtra = new IngresoHorasExtras("bono", "Junio", 75d, 1d);
		
	}
	
	@Test
	public void testTotalPercibido() {
		assertEquals(0, felipe.getTotalPercibido());
		felipe.agregarIngreso(ingresoUno);
		felipe.agregarIngreso(ingresoExtra);
		assertEquals(150d, felipe.getTotalPercibido());
	}
	
	@Test
	public void testMontoImponible() {
		felipe.agregarIngreso(ingresoUno);
		felipe.agregarIngreso(ingresoExtra);
		assertEquals(75d, felipe.getMontoImponible());
	}
	
	@Test
	public void testImpuestoAPagar() {
		felipe.agregarIngreso(ingresoUno);
		felipe.agregarIngreso(ingresoExtra);
		assertEquals(1.5d, felipe.getImpuestoAPagar());
	}
}
