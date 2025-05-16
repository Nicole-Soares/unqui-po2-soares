package ar.edu.unq.poo2.tpStateMp3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Reproductor {

	EstadoDeSong estado;
	List<Song> listaDeCanciones;
	
	public Reproductor() {
		super();
		this.estado = new SeleccionDeCanciones();
		this.listaDeCanciones = new ArrayList<>();
	}
	
	public List<Song> getListaDeCanciones() {
		return listaDeCanciones;
	}

	public void setListaDeCanciones(List<Song> listaDeCanciones) {
		this.listaDeCanciones = listaDeCanciones;
	}

	public void agregarUnaCancionALaLista(Song cancion) {
		this.getListaDeCanciones().add(cancion);// add modifica la lista interna
	}
	
	public EstadoDeSong getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeSong estado) {
		this.estado = estado;
	}

	public void playALaCancion(Song song) {
		
		song.play(this);
		
	}

	public void cambiarEstado(EstadoDeSong estado) {
		this.setEstado(estado);
		
	}

	public int cantidadDeSongs() {
		
		return this.getListaDeCanciones().size();
	}

	public void pausarLaCancion(Song song) {
		song.pausar(this);
		
	}

	public void stopALaCancion(Song song) {
		song.stop(this);
		
	}

}
	
	
	
	