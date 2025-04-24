package ar.edu.unq.poo2.tp4;

import java.util.ArrayList;
import java.util.List;



public class Trabajador {

	private List<Ingreso> listaDeIngresos;
	
	public Trabajador(List<Ingreso> listaDeIngresos) {
		super();
		this.listaDeIngresos = listaDeIngresos;
	}
	
	public Trabajador() {
		super();
		this.listaDeIngresos = new ArrayList<Ingreso>();
	}


	public List<Ingreso> getListaDeIngresos(){
		return this.listaDeIngresos;
	}
	
	public void setListaDeIngresos(List<Ingreso> lista) {
		listaDeIngresos = lista;
	}

	public void agregarIngreso(Ingreso i) {
		listaDeIngresos.add(i);
	}
	
	//el total de todos los ingresos, los normales y los de hora extra
	
	public double getTotalPercibido(){
		double total = 0d;
		for(Ingreso ingreso:listaDeIngresos) {
			total+= ingreso.getMonto();
		}
		return total;
	}
	
	public double getMontoImponible(){
		double total = 0d;
		for(Ingreso ingreso:listaDeIngresos) {
			
			total+= ingreso.montoImponible();
		}
		return total;
	}
	
	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 2 / 100;
	}
}
