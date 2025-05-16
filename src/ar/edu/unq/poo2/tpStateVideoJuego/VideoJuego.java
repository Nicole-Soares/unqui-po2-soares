package ar.edu.unq.poo2.tpStateVideoJuego;

import java.util.ArrayList;
import java.util.List;

public class VideoJuego {

	
	private int contador;
	private EstadoDelVideoJuego estado;
	
	public VideoJuego( EstadoDelVideoJuego estado) {
		super();
		this.estado = estado;
		this.contador = 0;
	}
	
	public VideoJuego( ) {
		super();
		this.contador = 0;
		this.estado = new EsperandoJugadores();
	}
	
	
	
	
	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	
	
	public EstadoDelVideoJuego getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoDelVideoJuego estado) {
		this.estado = estado;
	}
	
	public void presionarElBotonDeInicio(){
		this.getEstado().presionaronElBoton(this);
	}

	

	public void cambiarEstado(EstadoDelVideoJuego estado) {
		this.setEstado(estado);
		
	}

	public void ingresarUnaFicha() {
		this.setContador((this.getContador() + 1));
		
	}
	
	
}
