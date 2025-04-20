package ar.edu.unq.poo2.tp4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductoPrimeraNecesidadTest {

	

		private ProductoPrimeraNecesidad leche;
		
		@BeforeEach
		public void setUp() {
			leche = new ProductoPrimeraNecesidad("Leche", 8d, false, 10d);
		}
		
		@SuppressWarnings("removal")
		@Test
		public void testCalcularPrecio() {
			assertEquals(new Double(7.2), leche.getPrecio());
		}
	}



