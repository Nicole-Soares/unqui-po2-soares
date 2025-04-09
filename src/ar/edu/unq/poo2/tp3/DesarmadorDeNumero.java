package ar.edu.unq.poo2.tp3;

import java.util.ArrayList;

public class DesarmadorDeNumero {
	
	
	
	public int numeroConMayorCantidadDeCifrasPares(ArrayList<Integer> numeros) {
		
		ArrayList<Integer>listaARecorrer = numeros;
		int numeroConMayorCantidadDePares = 0;
		
		for(int i = 1; i < numeros.size(); i++) {
			int primerElemento = listaARecorrer.get(i);
			if(this.cantidadDeCifrasPares(numeroConMayorCantidadDePares) < this.cantidadDeCifrasPares(primerElemento)) {
				numeroConMayorCantidadDePares = primerElemento;
				
			}
			listaARecorrer.remove(i);
			

			
		}
		return numeroConMayorCantidadDePares;
		
	}
		public int cantidadDeCifrasPares(int numero) {
			
			int cantidadPares = 0;
			int numeroModificado = numero;
			
			if(numero == 0) {
				
				cantidadPares++;
			};
			
			while(numeroModificado !=0){
				
				if(esPar( numeroModificado%10)) {
					cantidadPares ++;;
					
				}
				
				numeroModificado = numeroModificado/10;
			}
			
			return cantidadPares;
		
		
		
		}
	
		private boolean esPar(int numero) {
			return numero % 2 == 0;
		}
	
	

	/*public Integer numeroConMayorCantidadDeCifrasPares(ArrayList<Integer> numeros) {
		ArrayList<Integer> listaNumerosModificada = numeros;
		ArrayList<ArrayList<Integer>> listaDeListaConNumeros = new ArrayList<>();
		for(int i=0; i <= (listaNumerosModificada.size() - 1); i++) {
			
			int primerElemento = listaNumerosModificada.get(i);
			listaDeListaConNumeros.add(listaConNumerosSeparados(primerElemento));
			listaNumerosModificada.remove(i);
			
		}
		
		
		return numeroConMayorCifrasPares(listaDeListaConNumeros);
	}




	public ArrayList<Integer> listaConNumerosSeparados(int numeroASeparar){
		
		int nuevoNumero = numeroASeparar;
		ArrayList<Integer> listaConLosNumerosSeparados = new ArrayList<>();
		
		for(int i=0; i!=nuevoNumero; i++ ) {
			listaConLosNumerosSeparados.addFirst(nuevoNumero % 10);
			nuevoNumero = nuevoNumero/10;
			
		}
		return listaConLosNumerosSeparados;
		
	}
	
	public int numeroConMayorCifrasPares(ArrayList<ArrayList<Integer>>numeros) {
		
		ArrayList<ArrayList<Integer>>listaARecorrer = numeros;
		ArrayList<Integer> listaDenumeroConMayorCifras = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i < (listaARecorrer.size()); i++) {
			
			
			ArrayList<Integer> primerElemento = listaARecorrer.get(i);
			
			if(cantidadDeCifrasPares(listaDenumeroConMayorCifras) < cantidadDeCifrasPares(primerElemento)) {
				listaDenumeroConMayorCifras = primerElemento;
				listaARecorrer.remove(i);
			}
			listaARecorrer.remove(i);
		}
		 for (int numero : listaDenumeroConMayorCifras) {
	            sb.append(numero);
	        }

	     int resultado = Integer.parseInt(sb.toString());
	     
	     return resultado;
		
	}




	private int cantidadDeCifrasPares(ArrayList<Integer> listaDenumeroConMayorCifras) {
		
		int cantidadDePares = 0;
		for(int i=0; i < (listaDenumeroConMayorCifras.size()); i++) {
			int primerElemento = listaDenumeroConMayorCifras.get(i);
			
			if(esPar(primerElemento)) {
				cantidadDePares = cantidadDePares + 1;
				listaDenumeroConMayorCifras.remove(i);
			}
			listaDenumeroConMayorCifras.remove(i);
		}
		return cantidadDePares;
	}
	
	private boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	*/
}




