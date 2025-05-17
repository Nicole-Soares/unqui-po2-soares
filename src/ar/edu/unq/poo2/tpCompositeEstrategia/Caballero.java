package ar.edu.unq.poo2.tpCompositeEstrategia;

public class Caballero extends Personaje{

	
	
	public Caballero(Coordenada coordenadasDelPersonaje) {
		super(coordenadasDelPersonaje);
	}

	@Override
	public void caminarHasta(Coordenada coordenadasDeLlegada, Mapa mapa) {
		 int filaDeLlegada = coordenadasDeLlegada.getAlturaDelMapa();
		 int columnaDeLlegada = coordenadasDeLlegada.getAnchoDelMapa();
		 int filaActual = this.getCoordenadasDelPersonaje().getAlturaDelMapa();
		 int columnaActual = this.getCoordenadasDelPersonaje().getAnchoDelMapa();

		        // Mientras no haya llegado al destino
		        while (filaActual != filaDeLlegada || columnaActual != columnaDeLlegada) {
		            // Alternar entre movimiento en fila y columna para el zigzag
		            if (Math.abs(filaDeLlegada - filaActual) > Math.abs(columnaDeLlegada - columnaActual)) {
		                // Mover en fila primero
		                filaActual += (filaDeLlegada > filaActual) ? 1 : -1;
		            } else {
		                // Mover en columna
		                columnaActual += (columnaDeLlegada > columnaActual) ? 1 : -1;
		            }

		            // Actualizar posición del caballero
		            this.setCoordenadasoDelPersonaje(new Coordenada(filaActual, columnaActual));
		        }
		    }
		
		
		
	
}
