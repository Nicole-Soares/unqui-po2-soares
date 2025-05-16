package ar.edu.unq.poo2.tpStateVideoJuego;

public class EsperandoJugadores extends EstadoDelVideoJuego {
	
@Override
public void presionaronElBoton(VideoJuego videojuego) {
	
	// esto sirve para que no pueda tocar el boton continuamente y genere instancias del estado continuamente
	
	if(videojuego.getContador() == 1) {
		JugandoUnJugador estado = new JugandoUnJugador();
		videojuego.cambiarEstado(estado);
	} 
	else if (videojuego.getContador() == 2) {
		JugandoDosJugadores estado = new JugandoDosJugadores();
		videojuego.cambiarEstado(estado);
		}
	else {
		System.out.println("Ingresar fichas.");
	}
	
		
	};
}
