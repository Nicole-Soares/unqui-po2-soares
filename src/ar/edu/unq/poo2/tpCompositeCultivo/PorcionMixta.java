package ar.edu.unq.poo2.tpCompositeCultivo;

import java.util.List;

public class PorcionMixta extends Porcion {

	
	private List<Porcion> listaDePorciones;
	
	public PorcionMixta(List<Porcion>listaDePorciones) { // el terreno se divide en 4 porciones
		super();
		this.listaDePorciones= listaDePorciones;
	}
	
	

	public List<Porcion> getListaDePorciones() {
		return listaDePorciones;
	}



	public void agregarUnCultivo(List<Porcion> listaDePorciones) {
		this.listaDePorciones = listaDePorciones;
	}



	@Override
	public double gananciaAnualesDeSoja() {
		
		double totalDelMonto = 0;
		for(Porcion porcion: listaDePorciones) {
			totalDelMonto+= (porcion.gananciaAnualesDeSoja()) /4 ; // lo dividimos por 4 porque son 4 sectores, me traigo el precio como si fuera puro y lo divido
		}
		
		return totalDelMonto;
	}
	
	@Override
	public double ganaciaAnualDeTrigo() {
		double totalDelMonto = 0;
		for(Porcion porcion: listaDePorciones) {
			totalDelMonto+= (porcion.ganaciaAnualDeTrigo()) /4 ; // lo dividimos por 4 porque son 4 sectores, me traigo el precio como si fuera puro y lo divido
		}
		
		return totalDelMonto;
	}

}
