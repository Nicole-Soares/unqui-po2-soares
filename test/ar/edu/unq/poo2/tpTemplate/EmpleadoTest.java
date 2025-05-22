package ar.edu.unq.poo2.tpTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {

	
	private Planta empleadoPlanta;
	private Temporario empleadoTemporario;
	private Pasante empleadoPasante;
	
	@BeforeEach 
	public void setUp() {
		empleadoPlanta = new Planta(3000,false,0, 4);
		empleadoTemporario = new Temporario(1000, true,1, 500);
		empleadoPasante = new Pasante(100, false, 0, 2);
		
		
	}
	
	
	@Test
	public void testeandoElSueldoBrutoDelEmpleadoDePlanta() {
	
		assertEquals(2610, empleadoPlanta.sueldo());
	}
	
	@Test
	public void testeandoElSueldoBrutoDelEmpleadoPasante() {
	
		
		double esperado = 156.6;
		double resultado = empleadoPasante.sueldo();
		
		
		assertEquals(esperado, resultado, 0.0001);
	}
}
