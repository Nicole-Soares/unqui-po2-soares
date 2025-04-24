package ar.edu.unq.poo2.tp5;

public class ProductoDeCooperativa extends ProductoT5 {

	public ProductoDeCooperativa(String nombre, double precio, int cantidad) {
		super(nombre, precio, cantidad);
	}

	@Override
	public double getPrecio() {
		return (super.getPrecio() - this.descuentoPorCooperativa());
	}
	
	protected double descuentoPorCooperativa() {
		return (double) ((super.getPrecio() * 10) / 100);
	}			
}
