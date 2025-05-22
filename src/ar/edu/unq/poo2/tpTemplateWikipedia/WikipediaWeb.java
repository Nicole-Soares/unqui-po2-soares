package ar.edu.unq.poo2.tpTemplateWikipedia;

import java.util.ArrayList;
import java.util.List;

public class WikipediaWeb {

	private List<WikipediaPage> paginas;
	private Filtro filtro;

	public WikipediaWeb(List<WikipediaPage> paginas, Filtro filtro) {
		super();
		this.paginas = paginas;
		this.setFiltro(filtro);
	}
	
	public WikipediaWeb(Filtro filtro) {
		super();
		this.paginas = new ArrayList<>();
		this.setFiltro(filtro);
	}

	public List<WikipediaPage> getPaginas() {
		return paginas;
	}

	public void agregarPagina(WikipediaPage pag) {
		this.getPaginas().add(pag);
	}

	public Filtro getFiltro() {
		return filtro;
	}

	public void setFiltro(Filtro filtro) {
		this.filtro = filtro;
	}
	
	
}