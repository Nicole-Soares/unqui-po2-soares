package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TestDesarmadorDeNumeros {

	
		@Test
		public void TestearDesarmadorDeNumeros(){
			DesarmadorDeNumero d = new DesarmadorDeNumero();
			List<Integer> numerosList = Arrays.asList(10, 222);
	        ArrayList<Integer> numeros = new ArrayList<>(numerosList);
			assertEquals(d.numeroConMayorCantidadDeCifrasPares(numeros),222);
			} 
}
