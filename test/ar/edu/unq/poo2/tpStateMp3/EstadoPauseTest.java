package ar.edu.unq.poo2.tpStateMp3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstadoPauseTest {

	private Reproductor reproductor;
	private Song song;
	
	@BeforeEach
	public void setUp() {
		reproductor = new Reproductor();
		song = new Song();
		
	}
	
	@Test
	public void testeandoLaPausaDeUnPlay() {
		reproductor.playALaCancion(song);
		reproductor.pausarLaCancion(song);
		
		assertTrue(reproductor.getEstado() instanceof Pause);
	}
	
	@Test
	public void testeandoLaPausaDeUnaPausa() {
		reproductor.playALaCancion(song);
		reproductor.pausarLaCancion(song);
		reproductor.pausarLaCancion(song);
		
		assertTrue(reproductor.getEstado() instanceof Play);
	}
	
	@Test
	public void testeandoLaPausaDeUnaSeleccionDeCanciones() {
		
		//EstadoDeSong seleccionar = new SeleccionDeCanciones ();
		
		IllegalStateException excepcion = assertThrows(
	            IllegalStateException.class,
	            () -> reproductor.pausarLaCancion(song)
	        );
		// Opcional: Verificar el mensaje de la excepción
        assertEquals("Acción 'pausar' no permitida en este estado", excepcion.getMessage());
		
	}
}
