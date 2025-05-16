package ar.edu.unq.poo2.tpStateMp3;

public class Play extends EstadoDeSong{

	@Override
	public void pausar(Reproductor reproductor, Song song) {
		
		EstadoDeSong estadoPausado = new Pause();
		reproductor.cambiarEstado(estadoPausado);
		
	}
	
	@Override
	public void stop(Reproductor reproductor, Song song) {
		
		EstadoDeSong estadoSeleccion = new SeleccionDeCanciones();
		reproductor.cambiarEstado(estadoSeleccion);
	}
}
