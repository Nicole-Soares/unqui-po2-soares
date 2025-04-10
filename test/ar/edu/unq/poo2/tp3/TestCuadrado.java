package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCuadrado {

private Cuadrado cuadrado; //declarado como variable de instancia
private Punto punto;

	@BeforeEach
	 public void setUp(){
	 
		 punto = new Punto(3,4);
		 cuadrado = new Cuadrado(4,4,punto); // inicializa la variable de instancia
		 
	
	 }
	
	@Test
	public void TesteandoLaSuma() {
		//Multioperador multioperador = new Multioperador(); // inicializa la variable de instancia
		 
		
		assertEquals(cuadrado.area(), 16);
		
	}
}
