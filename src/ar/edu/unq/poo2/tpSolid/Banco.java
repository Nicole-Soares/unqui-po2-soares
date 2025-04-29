package ar.edu.unq.poo2.tpSolid;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private BancoCredito sectorCredito;
	private List<Cliente> listaDeClientes;
	
	
	public Banco(BancoCredito sectorCredito, List<Cliente> listaDeClientes) {
		super();
		this.sectorCredito = sectorCredito;
		this.listaDeClientes = listaDeClientes;
	}
	
	public Banco(BancoCredito sectorCredito) {
		super();
		this.sectorCredito = sectorCredito;
		List<Cliente> listaDeClientes = new ArrayList<>();
	}

	public BancoCredito getSectorCredito() {
		return sectorCredito;
	}

	public void setSectorCredito(BancoCredito sectorCredito) {
		this.sectorCredito = sectorCredito;
	}

	public List<Cliente> getListaDeClientes() {
		return listaDeClientes;
	}

	public void setListaDeClientes(List<Cliente> listaDeClientes) {
		this.listaDeClientes = listaDeClientes;
	}
	
	public void agregarUnCliente(Cliente cliente) {
		this.getListaDeClientes().add(cliente);
	}
	
	public double solicitanCredito(Credito credito) {
		//lo deriva en el sector de creditos que lo agrega a su lista
		 this.getSectorCredito().agregarUnaSolicitudDeCredito(credito);
		 
		 //evaluo la situacion, el cual se fija de cambiar el estado del credito
		 this.evaluarSolicitud(credito);
		 
		 //retorna el monto correspondiente segun si fue aprobado, desaprobado o pendiente
		 return(credito.montoOtorgado());
	}
	
	private void evaluarSolicitud(Credito credito) {
		credito.evaluarEstadoDelCredito();
	}
	
	public double montoTotalADesembolsarDeTodosLosCreditosAprobados() {
		return this.getSectorCredito().montoTotalADesembolsarParaTodosLosCreditosAprobados();
	}
	
}
