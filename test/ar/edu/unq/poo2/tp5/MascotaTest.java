package ar.edu.unq.poo2.tp5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MascotaTest {


	private Persona felipe;
	private Persona mia;
	private LocalDate fechaNacimientoFelipe;
	private LocalDate fechaNacimientoMia;
	private Mascota coco;
	private Mascota pipi;
	private List<Item>listaDePersonasYMascotas;
	
	
	@BeforeEach
	public void setUp() {
		fechaNacimientoFelipe = LocalDate.of(1995, 5, 15);
		felipe = new Persona("Felipe", fechaNacimientoFelipe);
		fechaNacimientoMia = LocalDate.of(1990, 5, 15);
		mia = new Persona("Felipe", fechaNacimientoMia);
		coco = new Mascota("Coco", "labrador");
		pipi = new Mascota("pipi", "dalmata");
		
	}
	

	
	@Test
	public void testNombreMascota() {
		
		assertEquals("Coco", coco.getNombre());
	}
	
	@Test
	public void testRaza() {
		
		assertEquals("dalmata", pipi.getRaza());
	}
	
	
	@Test
	public void testCollection() {
		
		 listaDePersonasYMascotas = new ArrayList<Item>();
		 listaDePersonasYMascotas.add(felipe);
		 listaDePersonasYMascotas.add(coco);
		for(Item item: listaDePersonasYMascotas) {
			 System.out.println(item);
		}
	}
}
