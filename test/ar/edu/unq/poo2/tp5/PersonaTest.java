package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {


	private Persona felipe;
	private Persona mia;
	private LocalDate fechaNacimientoFelipe;
	private LocalDate fechaNacimientoMia;
	
	
	@BeforeEach
	public void setUp() {
		fechaNacimientoFelipe = LocalDate.of(1995, 5, 15);
		felipe = new Persona("Felipe", fechaNacimientoFelipe);
		fechaNacimientoMia = LocalDate.of(1990, 5, 15);
		mia = new Persona("Felipe", fechaNacimientoMia);
		
	}
	

	
	@Test
	public void testNombrePersona() {
		
		assertEquals("Felipe", felipe.getNombre());
	}
	
	@Test
	public void testFechaNacimiento() {
		
		assertEquals(fechaNacimientoFelipe, felipe.getFechaDeNacimiento());
	}
	
	@Test
	public void testEdad() {
		
		assertTrue(felipe.edad()==mia.edad());
	}
	
	@Test
	public void testMenorEdad() {
		
		assertTrue(felipe.esMenorQue(mia));
	}
}
