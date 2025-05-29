package ar.edu.unq.poo2.tpEnumStreams2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Municipio {

	private List<ActividadSemanal> listaDeTodasLasActividades;

	public Municipio(List<ActividadSemanal>listaDeTodasLasActividades) {
		super();
		this.listaDeTodasLasActividades = listaDeTodasLasActividades;
	}
	
	public Municipio() {
		listaDeTodasLasActividades = new ArrayList<>();
	}

	public List<ActividadSemanal> getListaDeTodasLasActividades() {
		return listaDeTodasLasActividades;
	}

	public void setListaDeTodasLasActividades(List<ActividadSemanal> listaDeTodasLasActividades) {
		this.listaDeTodasLasActividades = listaDeTodasLasActividades;
	}

	public Integer cantidadDeActividades() {
		return(this.getListaDeTodasLasActividades().size());
	}

	public void imprimirActividades() {
		Stream<ActividadSemanal> listaDeActividades = this.getListaDeTodasLasActividades().stream();	
		listaDeActividades.forEach(actividad-> System.out.println(actividad));
	}
}
