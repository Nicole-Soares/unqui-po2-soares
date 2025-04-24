package ar.edu.unq.poo2.tp5;

public class Servicio implements Factura{

	private int costoPorUnidadConsumida;
	private int cantidadDeUnidadesConsumidas;
	
	
	public Servicio(int costoPorUnidadConsumida, int cantidadDeUnidadesConsumidas) {
		super();
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}


	public int getCostoPorUnidadConsumida() {
		return costoPorUnidadConsumida;
	}


	public void setCostoPorUnidadConsumida(int costoPorUnidadConsumida) {
		this.costoPorUnidadConsumida = costoPorUnidadConsumida;
	}


	public int getCantidadDeUnidadesConsumidas() {
		return cantidadDeUnidadesConsumidas;
	}


	public void setCantidadDeUnidadesConsumidas(int cantidadDeUnidadesConsumidas) {
		this.cantidadDeUnidadesConsumidas = cantidadDeUnidadesConsumidas;
	}
	
	
	public double montoTotalAPagar(){
		return this.getCantidadDeUnidadesConsumidas() * this.getCostoPorUnidadConsumida();
	}
	
	public double montoTotal() {
		return this.montoTotalAPagar();
	}
	
}
