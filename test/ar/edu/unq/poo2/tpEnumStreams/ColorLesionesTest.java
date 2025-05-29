package ar.edu.unq.poo2.tpEnumStreams;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ColorLesionesTest {

	
	private ColorLesiones miColorDeLesionRojo;
	private ColorLesiones miColorDeLesionAmarillo;
	
	@BeforeEach
	public void setUp() {
		 miColorDeLesionRojo = ColorLesiones.ROJO;
		 miColorDeLesionAmarillo = ColorLesiones.AMARILLO;
	}
	
	@Test
	public void testeandoLaGravedad() {
		assertEquals("Alto", miColorDeLesionRojo.getNivelDeRiesgo());
	}
	
	@Test
	public void testeandoLaDescripcion() {
		assertEquals("Te estas por morir", miColorDeLesionAmarillo.getDescripcion());
	}
	
	@Test
	public void testeandoSiguienteColor() {
		
		 ColorLesiones color = miColorDeLesionRojo.siguienteColor();
		assertEquals("Alto", color.getNivelDeRiesgo());
	}
}
