package ar.edu.unq.poo2.tp3;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPersona {

	private Persona persona1;
	private LocalDate fechaNac;
	
	@BeforeEach
	public void setUp(){
			
		fechaNac = LocalDate.of(1998, 4, 10);;
		persona1 = Persona.crearPersona("Nicole", fechaNac);
			
	}
	
	@Test
	public void TesteandoLaPersona() {
		System.out.println("Nombre: " + persona1.getNombre());
	    System.out.println("Fecha de Nacimiento: " + persona1.getFecha());
	}

    
}
