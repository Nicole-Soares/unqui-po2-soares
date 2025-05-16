package ar.edu.unq.poo2.tpStateMp3;

public class Song {
	
	

	public void play(Reproductor reproductor) {
		(reproductor.getEstado()).play(reproductor, this);
	}

	public void pausar(Reproductor reproductor) {
		(reproductor.getEstado()).pausar(reproductor, this);
		
	}

	public void stop(Reproductor reproductor) {
		(reproductor.getEstado()).stop(reproductor, this);
		
	}
}
