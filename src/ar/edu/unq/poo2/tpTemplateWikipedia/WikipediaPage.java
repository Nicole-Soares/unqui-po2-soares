package ar.edu.unq.poo2.tpTemplateWikipedia;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WikipediaPage implements  IWikipediaPage{

	private String titulo;
	private List<WikipediaPage> links;
	private Map<String, List<WikipediaPage>> infoBox ;
	
	public WikipediaPage(String titulo, List<WikipediaPage> links, Map<String, List<WikipediaPage>> infoBox) {
		super();
		this.titulo = titulo;
		this.links = links;
		this.infoBox = infoBox;
	}
	
	public WikipediaPage(String titulo) {
		super();
		this.titulo = titulo;
		this.links = new ArrayList<>();
		this.infoBox =  new HashMap<>(); // mapa vacio
	}

	public String getTittle() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<WikipediaPage> getLinks() {
		return links;
	}

	public void agregarPagina(WikipediaPage pag) {
		this.getLinks().add(pag);
	}
	

	public Map<String, List<WikipediaPage>> getInfoBox() {
		return infoBox;
	}

	public void agregarPalabraJuntoConSuLista(String palabra, WikipediaPage pag) {
		// Usa computeIfAbsent para obtener o crear la lista y luego agregar la página.
		this.infoBox.computeIfAbsent(palabra, k -> new ArrayList<>()).add(pag);
	}

	 @Override // <--- ¡Esto es clave!
	    public String toString() {
	        // Puedes personalizar esto para mostrar lo que sea más útil para depurar
	        StringBuilder sb = new StringBuilder();
	        sb.append("WikipediaPage[Title='").append(titulo).append("'");
	        sb.append(", Links: [");
	        for (int i = 0; i < links.size(); i++) {
	            sb.append(links.get(i).getTittle()); // Solo mostrar el título de los links para evitar recursión infinita o logs muy largos
	            if (i < links.size() - 1) {
	                sb.append(", ");
	            }
	        }
	        sb.append("]]");
	        return sb.toString();
	    }
	
	
}
