package ar.edu.unq.poo2.tpMockito;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PokerStatus {

	// poker es cuando 4 de las 5 cartas tienen el mismo valor
	
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) { // las cartas se representan con el valor + la letra del palo, ej 2P (2 pica)
																										// P= PICA, C= CORAZONES, D = DIAMANTES, T= TREBOLES
		Map<String, Integer> conteoValores = new HashMap<>();
	
		contarValor(carta1, conteoValores);
		contarValor(carta2, conteoValores);
		contarValor(carta3, conteoValores);
		contarValor(carta4, conteoValores);
		contarValor(carta5, conteoValores);
		
		return (conteoValores.values().stream().anyMatch(count -> count == 4));
	}
	
	private void contarValor(String carta, Map<String, Integer> conteo) {
	String valor = carta.substring(0, carta.length() - 1);
	conteo.put(valor, conteo.getOrDefault(valor, 0) + 1);
	}
    
    
    /////////////////////////////////////////////////////////////////////////////////////////////////////
    public String verificarPoquerColorTrio(String carta1, String carta2, String carta3, String carta4, String carta5) { // las cartas se representan con el valor + la letra del palo, ej 2P (2 pica)
		// P= PICA, C= CORAZONES, D = DIAMANTES, T= TREBOLES
		Map<String, Integer> conteoValores = new HashMap<>();
		
		// Contar ocurrencias de cada valor
		contarValor(carta1, conteoValores);
		contarValor(carta2, conteoValores);
		contarValor(carta3, conteoValores);
		contarValor(carta4, conteoValores);
		contarValor(carta5, conteoValores);
		
		if(this.esPoquer(conteoValores)) {
			return "Poquer";
		}
			else if(this.esColor(new String[]{carta1, carta2, carta3, carta4, carta5})) {
				return "Color";
			}
			else {
				return "Trio";
			}
	}
		
    
    private boolean esPoquer(Map<String, Integer> conteoValores) {
    	 return conteoValores.values().stream().anyMatch(count -> count == 4);
    }
    
    
    private boolean esColor(String[] cartas) {
        char primerPalo = cartas[0].charAt(cartas[0].length() - 1);
        for (String carta : cartas) {
            char palo = carta.charAt(carta.length() - 1);
            if (palo != primerPalo) {
                return false;
            }
        }
        return true;
    }
    
	
	 public boolean verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4,Carta  carta5) {
	       
		 List<Carta> listaDeCartas = new ArrayList<>();
		 listaDeCartas.add(carta1);
		 listaDeCartas.add(carta2);
		 listaDeCartas.add(carta3);
		 listaDeCartas.add(carta4);
		 listaDeCartas.add(carta5);
		 
		 if (listaDeCartas.size() != 5) {
	            throw new IllegalArgumentException("Deben ser exactamente 5 cartas");
	        }
	        
	        Map<String, Integer> conteoValores = new HashMap<>();
	        
	        for (Carta carta : listaDeCartas) {
	            ponerEnMap(carta, conteoValores);
	        }
	        
	        return conteoValores.values().stream().anyMatch(count -> count == 4);
	    }
	 
	 
	 
	 
	 
	 
	    
	    private void ponerEnMap(Carta carta, Map<String, Integer> conteo) {
	        String valor = carta.getValor();
	        conteo.put(valor, conteo.getOrDefault(valor, 0) + 1);
	    }

	/*	public String ganadorDeLaJugada(PokerStatus poker, PokerStatus color) {
			if(poker.isPoquer() & color.isColor()) {
				return "Jugada numero 1";
			};
		}
		
	    */
	    
	
		
}
