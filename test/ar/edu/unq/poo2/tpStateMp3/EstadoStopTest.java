package ar.edu.unq.poo2.tpStateMp3;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstadoStopTest {

	private Reproductor reproductor;
	private Song song;
	
	@BeforeEach
	public void setUp() {
		reproductor = new Reproductor();
		song = new Song();
		
	}
	
	
	@Test
	public void testearElStopCuandoEstaEnPlay() {
		reproductor.playALaCancion(song);
		reproductor.stopALaCancion(song);
		assertTrue(reproductor.getEstado() instanceof SeleccionDeCanciones);// tiee que ser funcional
	}
	
}
