package ar.edu.unq.poo2.tpTemplateWikipedia;

import java.util.ArrayList;
import java.util.List;

public class FiltroEnComun extends Filtro {

	/*// recorro todos los links de la wikipedia y me fijo si la pag contiene algun link en comun con la wiikipedia pag
	// Este método es el que llama el test
    @Override
    public List<WikipediaPage> getSimilarPages(WikipediaPage pag, WikipediaWeb wikipedia) {
        List<WikipediaPage> listaDePaginasConLinkEnComun = new ArrayList<>();
        // Itera sobre cada WikipediaPage que está en la 'wikipedia' (la web)
        for (WikipediaPage wikipediaPageDeLaWeb : wikipedia.getPaginas()) {
            // Pregunta si 'wikipediaPageDeLaWeb' tiene un link en común con los links de 'pag'.
            // La lógica de 'contieneAlgunLink' ahora será más precisa.
        	listaDePaginasConLinkEnComun.addAll(listaConLosFiltrosAplicados(wikipediaPageDeLaWeb, pag));
        }
        return listaDePaginasConLinkEnComun;
    }*/

	@Override
    protected List<WikipediaPage> listaConLosFiltrosAplicados(WikipediaPage wikipediaPageDeLaWeb,WikipediaPage pag){
    	  List<WikipediaPage> listaDePaginasConLinkEnComun = new ArrayList<>();
    	if (this.contieneAlgunLink(wikipediaPageDeLaWeb, pag)) {
    		// Si retorna true, significa que esta 'wikipediaPageDeLaWeb'
    		// tiene un link que coincide con uno de los links de 'pag'.
    		// Añadimos ESA 'wikipediaPageDeLaWeb' a la lista.
    		listaDePaginasConLinkEnComun.add(wikipediaPageDeLaWeb);
    	}
    	return listaDePaginasConLinkEnComun;
    }
    
    
    private boolean contieneAlgunLink(WikipediaPage paginaDeLaWeb, WikipediaPage paginaPrincipalParaComparar) {
        // Optimización: Si cualquiera de las páginas no tiene enlaces, no puede haber enlaces en común.
        if (paginaDeLaWeb.getLinks().isEmpty() || paginaPrincipalParaComparar.getLinks().isEmpty()) {
            return false;
        }

        // Obtener todos los títulos de links de paginaPrincipalParaComparar para una búsqueda eficiente
        // Usamos un Set para búsquedas O(1) y para manejar duplicados (aunque aquí no es crítico).
        List<String> titulosLinksDePaginaPrincipal = new ArrayList<>(); // Usamos List para mantener el orden si fuera relevante, Set para velocidad.
        for (WikipediaPage linkDePagPrincipal : paginaPrincipalParaComparar.getLinks()) {
            if (linkDePagPrincipal.getTittle() != null) {
                titulosLinksDePaginaPrincipal.add(linkDePagPrincipal.getTittle());
            }
        }

        // Ahora, itera a través de los links de 'paginaDeLaWeb'
        for (WikipediaPage linkDePaginaDeLaWeb : paginaDeLaWeb.getLinks()) {
            // Compara el título de este link con todos los títulos de links de la página principal.
            // Siempre usa .equals() para comparar Strings. Objects.equals() maneja nulls.
            if (linkDePaginaDeLaWeb.getTittle() != null &&
                titulosLinksDePaginaPrincipal.contains(linkDePaginaDeLaWeb.getTittle())) {
                return true; // ¡Encontramos un link en común!
            }
        }

        return false; // No se encontró ningún link en común
    }
    
	
}
