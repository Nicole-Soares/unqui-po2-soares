package ar.edu.unq.poo2.tpTemplateWikipedia;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Filtro {

	public List<WikipediaPage> getSimilarPages(WikipediaPage pag, WikipediaWeb wikipedia) {
        List<WikipediaPage> listaDePaginasConLinkEnComun = new ArrayList<>();
       
        for (WikipediaPage wikipediaPageDeLaWeb : wikipedia.getPaginas()) {
           
        	listaDePaginasConLinkEnComun.addAll(listaConLosFiltrosAplicados(wikipediaPageDeLaWeb, pag));
        }
        return listaDePaginasConLinkEnComun;
    }

	abstract List<WikipediaPage> listaConLosFiltrosAplicados(WikipediaPage wikipediaPageDeLaWeb, WikipediaPage pag); // operacion primitiva
	

	

}
