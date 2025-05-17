package ar.edu.unq.poo2.tpCompositeEstrategia;

public  abstract class Personaje {

	Coordenada coordenadasDelPersonaje;
	
	
	
	public Personaje(Coordenada coordenadasDelPersonaje) {
		super();
		this.coordenadasDelPersonaje = coordenadasDelPersonaje;
	}
	
	public Personaje() {
		super();
		this.coordenadasDelPersonaje = new Coordenada(1,1); // empieza (1,1)
	}


	public Coordenada getCoordenadasDelPersonaje() {
		return coordenadasDelPersonaje;
	}


	public void setCoordenadasoDelPersonaje(Coordenada coordenadas) {
		this.coordenadasDelPersonaje = coordenadas;
	}

	

	public abstract void caminarHasta(Coordenada coordenadas, Mapa mapa);
}
