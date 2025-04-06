package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestRectangulo {

	/*public void setUp(){
		Punto p = new Punto(1,2);
		Rectangulo r = new Rectangulo(2, 4, p);
	}*/
	
	@Test
	public void TestearGetterDeAltoDeRectangulo(){
		Punto p = new Punto(1,2);
		Rectangulo r = new Rectangulo(2, 4, p);
		assertEquals(r.getAltura(), 4);
		} 

}
