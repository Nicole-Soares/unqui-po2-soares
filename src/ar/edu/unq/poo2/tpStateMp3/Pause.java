package ar.edu.unq.poo2.tpStateMp3;

public class Pause extends EstadoDeSong{
	
	//si ya estaba en pausa y vuelven a pausar, lo pone en play
	@Override
	public void pausar(Reproductor reproductor, Song song) {
		EstadoDeSong estadoPlay = new Play();
		 reproductor.cambiarEstado(estadoPlay);
	}
	
	@Override
	public void stop(Reproductor reproductor, Song song) {
		
		EstadoDeSong estadoSeleccion = new SeleccionDeCanciones();
		reproductor.cambiarEstado(estadoSeleccion);
	}

}
