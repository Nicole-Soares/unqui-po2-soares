package ar.edu.unq.poo2.tp4;

public class ProductoPrimeraNecesidad extends Producto {

	//ejercicio 2
	 private double descuento;
	
	 //constructor
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean pertenece, double descuento) {
		super(nombre, precio, pertenece); //usar el constructor del padre, le paso los parametros en el mismo orden
		this.descuento = descuento;
	}

	@Override
	public double getPrecio() {
		return (super.getPrecio() - this.descuentoPorPrimeraNecesidad());
	}
	
	public double getDescuento() {
		return this.descuento;
	}
	
	protected double descuentoPorPrimeraNecesidad() {
		return (double) ((super.getPrecio() * this.getDescuento()) / 100);
	}
	
}
