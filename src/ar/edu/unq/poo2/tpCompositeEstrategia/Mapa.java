package ar.edu.unq.poo2.tpCompositeEstrategia;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

	List<Personaje> listaDePersonajes;
	Coordenada ocupacionDelMapa;
	List<Coordenada> listaDeCoordenadasDondeSeEncuentranLajas;
	
	
	public Mapa(List<Personaje> listaDePersonajes, Coordenada ocupacionDelMapa,
			List<Coordenada> listaDeCoordenadasDondeSeEncuentranLajas) {
		super();
		this.listaDePersonajes = listaDePersonajes;
		this.ocupacionDelMapa = ocupacionDelMapa;
		this.listaDeCoordenadasDondeSeEncuentranLajas = listaDeCoordenadasDondeSeEncuentranLajas;
	}
	
	public Mapa(List<Personaje> listaDePersonajes, Coordenada ocupacionDelMapa) {
		super();
		this.listaDePersonajes = listaDePersonajes;
		this.ocupacionDelMapa = ocupacionDelMapa;
		this.listaDeCoordenadasDondeSeEncuentranLajas = new ArrayList<>();
	}
	
	public Mapa(Coordenada ocupacionDelMapa,
			List<Coordenada> listaDeCoordenadasDondeSeEncuentranLajas) {
		super();
		this.listaDePersonajes =  new ArrayList<>();
		this.ocupacionDelMapa = ocupacionDelMapa;
		this.listaDeCoordenadasDondeSeEncuentranLajas = listaDeCoordenadasDondeSeEncuentranLajas;
	}
	
	public Mapa(Coordenada ocupacionDelMapa) {
		super();
		this.listaDePersonajes =  new ArrayList<>();
		this.ocupacionDelMapa = ocupacionDelMapa;
		this.listaDeCoordenadasDondeSeEncuentranLajas =  new ArrayList<>();
	}

	public List<Personaje> getListaDePersonajes() {
		return listaDePersonajes;
	}

	public void agregarPersonaje(Personaje personaje) {
		this.getListaDePersonajes().add(personaje);
	}

	public Coordenada getOcupacionDelMapa() {
		return ocupacionDelMapa;
	}

	public void setOcupacionDelMapa(Coordenada ocupacionDelMapa) {
		this.ocupacionDelMapa = ocupacionDelMapa;
	}

	private List<Coordenada> getListaDeCoordenadasDondeSeEncuentranLajas() {
		return listaDeCoordenadasDondeSeEncuentranLajas;
	}

	public void agregarCoordenadaDeLaja(Coordenada coordenada) {
		
		    if (!this.listaDeCoordenadasDondeSeEncuentranLajas.contains(coordenada)) {
		        this.listaDeCoordenadasDondeSeEncuentranLajas.add(coordenada);
		    }
		
	}

	public boolean hayLajaEnLaCeldaActual(int filaActualDelPersonaje, int columnaActualDelPersonaje) {
		Coordenada coordenada = new Coordenada(filaActualDelPersonaje, columnaActualDelPersonaje);
		
		return this.getListaDeCoordenadasDondeSeEncuentranLajas().contains(coordenada);
	}
	
	
}
