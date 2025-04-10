package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestPunto {

	private Punto puntoUno; //declarado como variable de instancia
	private Punto puntoDos;
	private Punto puntoTres;
	
	@BeforeEach
	 public void setUp(){
	 
		puntoUno = new Punto( 1, 4); // inicializa la variable de instancia
		puntoDos = new Punto( 2, 5); 
		puntoTres = new Punto( 3, 9); 
		
	
	 }
	
	@Test
	public void TesteandoLaSumaDeLosPuntos() {
		
		 
		
		assertEquals(puntoUno.sumar(puntoDos).getX(),puntoTres.getX() );
		
	}
}
