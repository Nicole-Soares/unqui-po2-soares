package ar.edu.unq.poo2.tpTemplateWikipedia;

import java.util.ArrayList;
import java.util.List;

public class FiltroMismaLetra extends Filtro{

	/*@Override
	public List<WikipediaPage> getSimilarPages(WikipediaPage pag1, WikipediaWeb wikipedia) {
		System.out.print("hola");
		List<WikipediaPage>listaDePaginasConMismaInicial = new ArrayList<>();
		for(WikipediaPage pagina: wikipedia.getPaginas() ) {
			if(pag1.getTittle().charAt(0) == pagina.getTittle().charAt(0)) {
				listaDePaginasConMismaInicial.add(pagina);
			}
		}
		return listaDePaginasConMismaInicial;
	}*/
	
	
	
		
		@Override
	    protected List<WikipediaPage> listaConLosFiltrosAplicados(WikipediaPage wikipediaPageDeLaWeb,WikipediaPage pag){
	    	  List<WikipediaPage> listaDePaginasConLinkEnComun = new ArrayList<>();
	    	  if(pag.getTittle().charAt(0) == pag.getTittle().charAt(0)) {
	    		  listaDePaginasConLinkEnComun.add(pag);
	    	}
	    	return listaDePaginasConLinkEnComun;
	    }
}
