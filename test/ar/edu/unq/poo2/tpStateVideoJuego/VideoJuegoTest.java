package ar.edu.unq.poo2.tpStateVideoJuego;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tp5.Agencia;
import ar.edu.unq.poo2.tp5.Caja;
import ar.edu.unq.poo2.tp5.Factura;
import ar.edu.unq.poo2.tp5.Mercado;
import ar.edu.unq.poo2.tp5.ProductoT5;
import ar.edu.unq.poo2.tp5.Servicio;

public class VideoJuegoTest {

	private VideoJuego videojuego;
	;
	
	@BeforeEach
	public void setUp() {
		videojuego = new VideoJuego();
		
		
	}
	

	
	@Test
	public void testeandoElEstadoEsperandoDelVideoJuego() {
		
		assertTrue(videojuego.getEstado() instanceof EsperandoJugadores);
	}
	

	@Test
	public void testeandoElEstadoJugandoUnJugador() {
		
		videojuego.ingresarUnaFicha();
		videojuego.presionarElBotonDeInicio();
		assertTrue(videojuego.getEstado() instanceof JugandoUnJugador);
	}

	@Test
	public void testeandoElEstadoJugandoDosJugadores() {
		
		videojuego.ingresarUnaFicha();
		videojuego.ingresarUnaFicha();
		videojuego.presionarElBotonDeInicio();
		assertTrue(videojuego.getEstado() instanceof JugandoDosJugadores);
	}
}

