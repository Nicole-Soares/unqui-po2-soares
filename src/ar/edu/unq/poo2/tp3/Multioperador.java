package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;

public class Multioperador {

		private ArrayList<Integer> numeros;

		//puede crearse con una lista vacia
		public Multioperador() {
			super();
			this.numeros = new ArrayList<Integer>();
		}
		
		//puede crearse con lista pasada por parametro

		public Multioperador(ArrayList<Integer> numeros) {
			super();
			this.numeros = numeros;
		}

		public ArrayList<Integer> getNumeros() {
			return numeros;
		}

		public void addNumber(int numero) {
			this.numeros.add(numero);
		}
		
		
		public int sumar(){
			int sumaDeTodosLosNumeros = 0;
			
			
			for(int entero:this.getNumeros()) {
				sumaDeTodosLosNumeros = sumaDeTodosLosNumeros + entero;
				
			}
			return sumaDeTodosLosNumeros;
				
		}

		public int restar() {
		    if (this.getNumeros().isEmpty()) {
		        throw new IllegalArgumentException("La lista de números no puede estar vacía para la resta.");
		    }
		    int restaDeTodosLosNumeros = this.getNumeros().get(0); // Tomamos el primer elemento como inicio

		    // Iteramos desde el segundo elemento (índice 1)
		    for (int i = 1; i < this.getNumeros().size(); i++) {
		        restaDeTodosLosNumeros -= this.getNumeros().get(i);
		    }
		    return restaDeTodosLosNumeros;
		}

		public int multiplicar() {
			if(this.getNumeros().isEmpty()) {
				throw new IllegalArgumentException("La lista de numeros no puede estar vacía para la multiplicación");
			}
			int multiplicacionDeTodosLosNumeros = this.getNumeros().get(0);
			
			for(int i=1; i <this.getNumeros().size(); i++) {
				multiplicacionDeTodosLosNumeros*= this.getNumeros().get(i);
			}
			
			return multiplicacionDeTodosLosNumeros;
		}
		
}
