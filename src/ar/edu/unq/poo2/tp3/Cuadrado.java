package ar.edu.unq.poo2.tp3;

public class Cuadrado {
	
	private int base;
	private int altura;
	private Punto punto;
	
	public Cuadrado(int ancho, int largo, Punto punto) {
		super();
		this.base = ancho;
		this.altura = largo;
		this.punto = punto;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int ancho) {
		this.base = ancho;
	}

	public int getAltura() {
		return altura;
	}

	public void seAltura(int largo) {
		this.altura = largo;
	}

	public Punto getPunto() {
		return punto;
	}

	public void setPunto(Punto punto) {
		this.punto = punto;
	}
	
	public int area() {
		return(this.getBase() * this.getAltura());
	}
	
	public int perimetro() {
		return(this.getBase() + this.getAltura());
	}
	
	public boolean esHorizontal() {
		return(this.getBase() > this.getAltura());
	}
	
	public boolean esVertical() {
		return(this.getBase() < this.getAltura());
	}
}
