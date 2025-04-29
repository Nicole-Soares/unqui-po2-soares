package ar.edu.unq.poo2.tpSolid;

import java.util.ArrayList;
import java.util.List;

public class BancoCredito {

	private List<Credito> listaDeSolicitudDeCreditos;

	public BancoCredito(List<Credito> listaDeSolicitudDeCreditos) {
		super();
		this.listaDeSolicitudDeCreditos = listaDeSolicitudDeCreditos;
	}

	public BancoCredito() {
		super();
		List<Credito> listaDeSolicitudDeCreditos = new ArrayList<>();
	}
	
	public List<Credito> getListaDeSolicitudDeCreditos() {
		return listaDeSolicitudDeCreditos;
	}

	public void setListaDeSolicitudDeCreditos(List<Credito> listaDeSolicitudDeCreditos) {
		this.listaDeSolicitudDeCreditos = listaDeSolicitudDeCreditos;
	}
	
	public void agregarUnaSolicitudDeCredito(Credito solicitud) {
		this.getListaDeSolicitudDeCreditos().add(solicitud);
	}

	public double montoTotalADesembolsarParaTodosLosCreditosAprobados() {
		
		List<Credito>listaDeCreditos= this.getListaDeSolicitudDeCreditos();
		double totalDeLosCreditosAprobados = 0;
		
		for(Credito credito:listaDeCreditos) {
			totalDeLosCreditosAprobados += credito.getEstado().montoOtorgado(credito);
		}
		
		return totalDeLosCreditosAprobados;
	}
}
