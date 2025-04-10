package ar.edu.unq.poo2.tp3;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestEquipoDeTrabajo {

	private Persona persona1;
	private LocalDate fechaNac;
	private ArrayList<Persona>integrantes;
	private EquipoDeTrabajo equipo;
	
	@BeforeEach
	public void setUp(){
			
		fechaNac = LocalDate.of(1998, 4, 10);;
		persona1 = Persona.crearPersona("Nicole", fechaNac);
		integrantes = new ArrayList<>();
		integrantes.add(persona1);
		equipo = EquipoDeTrabajo.crearEquipoDeTrabajo("witcher", integrantes);
			
	}
	
	@Test
	public void TesteandoElNombreDelEquipo() {
		assertEquals(equipo.getNombre(), "witcher");
		
	}
	
	@Test
	public void TesteandoElPromedioDelEquipo() {
		assertEquals(equipo.promedioDeEdadDeLosIntegrantes(),27 );
		
	}
}
