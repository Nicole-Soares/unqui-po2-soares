package ar.edu.unq.poo2.tpMockito;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PokerStatusMockitoTest {

	
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	private PokerStatus poker;
	private PokerStatus color;
	private PokerStatus trio;
	
	
	@BeforeEach
	public void setUp() {
		 carta1 = mock(Carta.class);
		 carta2 = mock(Carta.class);
		 carta3 = mock(Carta.class);
		 carta4 = mock(Carta.class);
		 carta5 = mock(Carta.class);
		 poker = new PokerStatus();
		 color = new PokerStatus();
		 trio = new PokerStatus();
	}
	
	
	@Test
	public void testarConMockitoSiEsPoker() {
		
		//test double configuracion
		when(carta1.getValor()).thenReturn("2");
		when(carta2.getValor()).thenReturn("2");
		when(carta3.getValor()).thenReturn("2");
		when(carta4.getValor()).thenReturn("2");
		when(carta5.getValor()).thenReturn("5");
		
		
		
		assertTrue(poker.verificar(carta1, carta2, carta3, carta4, carta5));
		
	}
	
	/*@Test
	public void testearJugadas() {
		when(poker.esPoquer()).thenReturn(true);
		when(color.esColor()).thenReturn(true);
		when(trio.esTrio()).thenReturn(true);
		
		assertEquals("Jugada 1 ganadora", poker.ganadorDeLaJugada(poker, color));
	}*/
}
