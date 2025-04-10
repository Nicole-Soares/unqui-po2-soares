package ar.edu.unq.poo2.tp3;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestMultioperador {

	private Multioperador multioperador; //declarado como variable de instancia
	
	@BeforeEach
	 public void setUp(){
	 
		 multioperador = new Multioperador(); // inicializa la variable de instancia
		 
		 multioperador.addNumber(1);
		 multioperador.addNumber(3);
		 multioperador.addNumber(5);
	
	 }
	
	@Test
	public void TesteandoLaSuma() {
		//Multioperador multioperador = new Multioperador(); // inicializa la variable de instancia
		 
		
		assertEquals(multioperador.sumar(), 9);
		
	}
	
	@Test
	public void TesteandoLaResta() {
		Multioperador multioperador = new Multioperador(); // inicializa la variable de instancia
		 
		 multioperador.addNumber(1);
		 multioperador.addNumber(3);
		 multioperador.addNumber(5);
		
		assertEquals(multioperador.restar(), -7);
	}
	
	@Test
	public void TesteandoLaMultiplicacion() {
		Multioperador multioperador = new Multioperador(); // inicializa la variable de instancia
		 
		 multioperador.addNumber(1);
		 multioperador.addNumber(3);
		 multioperador.addNumber(5);
		
		assertEquals(multioperador.multiplicar(), 15);
	}
	
}
