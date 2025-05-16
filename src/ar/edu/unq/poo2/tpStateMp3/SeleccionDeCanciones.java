package ar.edu.unq.poo2.tpStateMp3;

public class SeleccionDeCanciones extends EstadoDeSong {

	  @Override
	public void play(Reproductor reproductor, Song song) {
		EstadoDeSong estadoPlay = new Play();
		reproductor.cambiarEstado(estadoPlay);
		reproductor.agregarUnaCancionALaLista(song);
	}
}
