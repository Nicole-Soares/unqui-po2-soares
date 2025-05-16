package ar.edu.unq.poo2.tpStateMp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class EstadoPlayTest {

	private Reproductor reproductor;
	private Song song;
	
	@BeforeEach
	public void setUp() {
		reproductor = new Reproductor();
		song = new Song();
		
	}
	

	// tests de estados
	@Test
	public void testeandoElEstadoPlay() {
		
		assertTrue(reproductor.getEstado() instanceof SeleccionDeCanciones);
	}
	

	@Test
	public void testeandoDandoPlayAUnaCancion() {
		
		
		reproductor.playALaCancion(song);
		assertTrue(reproductor.getEstado() instanceof Play);
	}

	@Test 
	public void testeandoDandoPlayAUnReproductorEnPausa() {
		EstadoDeSong estadoPause = new Pause(); // Estado que no permite play()
		reproductor.cambiarEstado(estadoPause);
		
		
		IllegalStateException excepcion = assertThrows(
	            IllegalStateException.class,
	            () -> reproductor.playALaCancion(song)
	        );
		// Opcional: Verificar el mensaje de la excepción
        assertEquals("Acción 'play' no permitida en este estado", excepcion.getMessage());
	}
	
	//test de funcionalidad
	@Test
	public void testeandoDandoPlayAUnaCancionFuncional() {
		
		
		reproductor.playALaCancion(song);
		assertEquals(1, reproductor.cantidadDeSongs());
	}
	/*
	@Test
	public void testeandoElEstadoJugandoDosJugadores() {
		
		videojuego.ingresarUnaFicha();
		videojuego.ingresarUnaFicha();
		videojuego.presionarElBotonDeInicio();
		assertTrue(videojuego.getEstado() instanceof JugandoDosJugadores);
	}
	*/
}
