package ar.edu.unq.poo2.tpCompositeEstrategia;



public class Ingeniero extends Personaje {

	int lajas;

	
	public Ingeniero(Coordenada coordenadaDelPersonaje,int lajas) {
		super(coordenadaDelPersonaje);
		this.lajas = lajas;
	}
	
	public Ingeniero(int lajas) {
		super();
		this.lajas = lajas;
	}

	public int getLajas() {
		return lajas;
	}

	public void setLajas(int lajas) {
		this.lajas = lajas;
	}
	
	@Override
	public void caminarHasta(Coordenada coordenadasDeLlegada, Mapa mapa) {
		int filaDeLlegada = coordenadasDeLlegada.getAlturaDelMapa();
		int columnaDeLlegada = coordenadasDeLlegada.getAnchoDelMapa();
		int filaActualDelPersonaje = this.getCoordenadasDelPersonaje().getAlturaDelMapa();
		int columnaActualDelPersonaje = this.getCoordenadasDelPersonaje().getAnchoDelMapa();
		
		//lo actualizo 
		Coordenada coordenadasNuevas = new Coordenada(this.irALaFilaDeLlegada(filaActualDelPersonaje, filaDeLlegada, mapa, columnaActualDelPersonaje),this.irALaColumnaDeLlegada(columnaActualDelPersonaje,columnaDeLlegada, mapa, filaActualDelPersonaje));
		this.setCoordenadasoDelPersonaje(coordenadasNuevas);
		
		
	}
	
	
	private int irALaFilaDeLlegada(int filaActualDelPersonaje, int filaDeLlegada, Mapa mapa, int columnaActualDelPersonaje) {
		
		for(int i = filaActualDelPersonaje; i < filaDeLlegada; i++) {
			if(!mapa.hayLajaEnLaCeldaActual(i, columnaActualDelPersonaje) & this.hayLajaDisponibles()) {
				mapa.agregarCoordenadaDeLaja(new Coordenada(i, columnaActualDelPersonaje));
				this.setLajas(this.getLajas() - 1);
			}
		}
		
		return filaActualDelPersonaje;
		
	}

	

	private int irALaColumnaDeLlegada(int columnaActualDelPersonaje, int columnaDeLlegada, Mapa mapa, int filaActualDelPersonaje) {
		for(int i = columnaActualDelPersonaje; i < columnaDeLlegada; i++) {
			if(!mapa.hayLajaEnLaCeldaActual(filaActualDelPersonaje, i) & this.hayLajaDisponibles()) {
				mapa.agregarCoordenadaDeLaja(new Coordenada(filaActualDelPersonaje, i));
				this.setLajas(this.getLajas() - 1);
			}
		}
		
		return columnaActualDelPersonaje;
	}
	
	private boolean hayLajaDisponibles() {
			
			return this.getLajas() != 0;
		}
	
}
