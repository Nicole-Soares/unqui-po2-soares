package ar.edu.unq.poo2.tp3;

public class Multiplo {

	
	
	public int mayorMultiploDeEntre(int numero1, int numero2, int rango1, int rango2) {
		
		if(hayMultiploDeEnUnRangoDe(numero1,numero2, rango1, rango2)) {
			
			return multiploDeEnUnRangoDe(numero1, numero2, rango1, rango2);
		}
		else {
			return -1;
		}
		
		
		
		
	}



	public boolean hayMultiploDeEnUnRangoDe(int numero1, int numero2, int rango1, int rango2) {
		
		int rangoMinimo = rango1;
		int rangoMayor = rango2;
		boolean existeMultiplo = false;
		int numeroDelRangoActual = rangoMayor;
		
		while(!existeMultiplo && numeroDelRangoActual >= rangoMinimo) {
			if(numeroDelRangoActual % numero1 == 0 && numeroDelRangoActual % numero2 == 0) {
				return existeMultiplo = true;
			}
			
			numeroDelRangoActual = numeroDelRangoActual - 1;
		}
		
		return existeMultiplo;
		
	}
	
	public int multiploDeEnUnRangoDe(int numero1, int numero2, int rango1, int rango2) {
		
		int rangoMinimo = rango1;
		int rangoMayor = rango2;
		
		int numeroDelRangoActual = rangoMayor;
		
		while(numeroDelRangoActual >= rangoMinimo) {
			if(numeroDelRangoActual % numero1 == 0 && numeroDelRangoActual % numero2 == 0) {
				return numeroDelRangoActual;
			}
			
			numeroDelRangoActual = numeroDelRangoActual - 1;
		}
		
		return numeroDelRangoActual;
		
	}
}