package ar.edu.unq.poo2.tp3;

import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

public class TestMultiplo {

	@Test
	public void TestearMultiplo(){
		Multiplo m = new Multiplo();
		int numeroUno = 3;
        int numeroDos = 9;
        int rangoMinimo = 0;
        int rangoMaximo = 1000;
		assertEquals(m.mayorMultiploDeEntre(numeroUno, numeroDos, rangoMinimo, rangoMaximo),999);
		}
}
