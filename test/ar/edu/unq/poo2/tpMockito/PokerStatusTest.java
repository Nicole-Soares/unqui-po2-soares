package ar.edu.unq.poo2.tpMockito;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusTest {

	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private PokerStatus poker;
	
	@BeforeEach
	public void setUp() {
		//setup
		 carta1= new Carta("2", "Picas");
		 carta2= new Carta("2", "Palo");
		 carta3= new Carta("2", "Palo");
		 carta4= new Carta("2", "Diamante");
		 carta5= new Carta("6", "Corazon");
		 poker = new PokerStatus();
		
	}
	
	@Test
	 void testEsJugadaDePoker(){
		
		
		assertTrue(poker.verificar(carta1, carta2, carta3 ,carta4, carta5));
	}
	
	 @Test
	    public void testVerificarPokerNegativo() {
	        // Setup
	        PokerStatus pokerStatus = new PokerStatus();
	        
	        // Exercise
	        boolean resultado = pokerStatus.verificar(carta1,carta2, carta3, carta4, carta5);
	        
	        // Verify
	        assertFalse(resultado);
	    }
	    
	    @Test
	    public void testVerificarPokerConFiguras() {
	        // Setup
	        PokerStatus pokerStatus = new PokerStatus();
	        
	        // Exercise
	        boolean resultado = pokerStatus.verificar(carta1,carta2, carta3, carta4, carta5);
	        
	        // Verify
	        assertTrue(resultado);
	    }
	    
	    @Test
	    public void testVerificarPokerCon10() {
	        // Setup
	        PokerStatus pokerStatus = new PokerStatus();
	        
	        // Exercise
	        boolean resultado = pokerStatus.verificar(carta1,carta2, carta3, carta4, carta5);
	        
	        // Verify
	        assertTrue(resultado);
	    }
	    
	    @Test
	    public void testVerificarFullHouseNoEsPoker() {
	        // Setup
	        PokerStatus pokerStatus = new PokerStatus();
	        
	        // Exercise
	        boolean resultado = pokerStatus.verificar(carta1,carta2, carta3, carta4, carta5);
	        
	        // Verify
	        assertFalse(resultado);
	    }
}
