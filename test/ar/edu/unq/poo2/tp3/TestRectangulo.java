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
	
	@Test
	public void TestearElAreaDelRectangulo() {
		Punto p = new Punto(1,2);
		Rectangulo r = new Rectangulo(2, 4, p);
		assertEquals(r.area(), 8);
	}

	@Test
	public void TestearElPerimetroDeUnRectangulo(){
		Punto p = new Punto(1,2);
		Rectangulo r = new Rectangulo(2, 4, p);
		assertEquals(r.perimetro(), 6);
	}
	
	@Test
	public void TestearSiEsHorizontalElRectangulo(){
		Punto p = new Punto(1,2);
		Rectangulo r = new Rectangulo(4, 2, p);
		assertEquals(r.esHorizontal(), true);
	}
	
	@Test
	public void TestearSiEsVerticalElRectangulo(){
		Punto p = new Punto(1,2);
		Rectangulo r = new Rectangulo(2, 4, p);
		assertEquals(r.esVertical(), true);
	}
}
