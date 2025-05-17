package ar.edu.unq.poo2.tpCompositeEstrategia;

import java.util.Objects;

public class Coordenada {

	int anchoDelMapa;
	int alturaDelMapa;
	
	public Coordenada(int anchoDelMapa, int alturaDelMapa) {
		super();
		this.anchoDelMapa = anchoDelMapa;
		this.alturaDelMapa = alturaDelMapa;
	}

	public int getAnchoDelMapa() {
		return anchoDelMapa;
	}

	public void setAnchoDelMapa(int anchoDelMapa) {
		this.anchoDelMapa = anchoDelMapa;
	}

	public int getAlturaDelMapa() {
		return alturaDelMapa;
	}

	public void setAlturaDelMapa(int alturaDelMapa) {
		this.alturaDelMapa = alturaDelMapa;
	}
	
	// para que compare objetos
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Coordenada otra = (Coordenada) obj;
	    return this.anchoDelMapa == otra.anchoDelMapa 
	           && this.alturaDelMapa == otra.alturaDelMapa;
	}

	@Override
	public int hashCode() {
	    return Objects.hash(anchoDelMapa, alturaDelMapa);
	}
	
}
