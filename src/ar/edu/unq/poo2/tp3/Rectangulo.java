package ar.edu.unq.poo2.tp3;

public class Rectangulo {

		private int base;
		private int altura;
		private Punto puntoOrigen;
		
		public Rectangulo(int base, int altura, Punto puntoOrigen) {
			super();
			this.base = base;
			this.altura = altura;
			this.puntoOrigen = puntoOrigen;
		}
		
		
		public int getBase() {
			return base;
		}
		public void setBase(int base) {
			this.base = base;
		}
		public int getAltura() {
			return altura;
		}
		public void setAltura(int altura) {
			this.altura = altura;
		}
		public Punto getPuntoOrigen() {
			return puntoOrigen;
		}
		public void setPuntoOrigen(Punto puntoOrigen) {
			this.puntoOrigen = puntoOrigen;
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
