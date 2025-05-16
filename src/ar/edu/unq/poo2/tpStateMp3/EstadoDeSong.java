package ar.edu.unq.poo2.tpStateMp3;

public class EstadoDeSong {

	public void play(Reproductor reproductor, Song song) {
		throw new RuntimeException("Acción 'play' no permitida en este estado");
		
	}

	public void pausar(Reproductor reproductor, Song song) {
		throw new RuntimeException("Acción 'pausar' no permitida en este estado");
		
	}
	
	public void stop(Reproductor reproductor, Song song) {
		throw new RuntimeException("Acción 'stop' no permitida en este estado");
	}

}
