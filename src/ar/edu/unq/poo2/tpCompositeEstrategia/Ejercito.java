package ar.edu.unq.poo2.tpCompositeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class Ejercito extends Personaje {

	List<Personaje> listaDePersonajes;

	public Ejercito(List<Personaje> listaDePersonajes) {
		super();
		this.listaDePersonajes = listaDePersonajes;
	}
	
	public Ejercito() {
		super();
		this.listaDePersonajes = new ArrayList<Personaje>();
		}

	public List<Personaje> getListaDePersonajes() {
		return listaDePersonajes;
	}

	public void agregarPersonaje(Personaje personaje) {
		this.getListaDePersonajes().add(personaje);
	}
	
	public void caminarHasta(Coordenada coordenadas, Mapa mapa) {
		for(Personaje personaje : listaDePersonajes) {
			personaje.caminarHasta(coordenadas, mapa);
		}
		
	}
	
}
