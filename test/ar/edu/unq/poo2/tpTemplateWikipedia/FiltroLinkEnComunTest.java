package ar.edu.unq.poo2.tpTemplateWikipedia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiltroLinkEnComunTest {

	   private WikipediaPage pag; // Dragon -> GameOfThrones
	   private WikipediaPage pag1; // Buenos Aires -> Serie
	   private WikipediaPage pag2; // GameOfThrones
	   private WikipediaPage pag3; // Serie
	   private Filtro filtroLinkEnComun;
	   private WikipediaWeb wikipedia; // Contiene pag1 inicialmente
	    
	@BeforeEach
	public void setUp() {
		    pag = new WikipediaPage("Dragon");
	        pag1 = new WikipediaPage("Buenos Aires");
	        pag2 = new WikipediaPage("GameOfThrones"); // Esta es la página linkeada por 'pag'
	        pag3 = new WikipediaPage("Serie");

	        filtroLinkEnComun = new FiltroEnComun();
	        wikipedia = new WikipediaWeb(filtroLinkEnComun); // Asumo constructor que toma Filtro

	        pag.agregarPagina(pag2); // Dragon ahora tiene un link a GameOfThrones
	        pag1.agregarPagina(pag3); // Buenos Aires tiene un link a Serie

	        // Inicialmente, wikipedia contiene solo 'pag1' ("Buenos Aires").
	        // pag1 (Buenos Aires) linkea a pag3 (Serie).
	        // pag (Dragon) linkea a pag2 (GameOfThrones).
	        // En este punto, no hay links en común entre los links de 'pag' y los links de 'pag1'.
	        wikipedia.agregarPagina(pag1);
		
		
		
	}
	
	@Test
	public void testearElFiltroDeLinkEnComunElCualNoHay() {
		
		
		//exercise
		List<WikipediaPage> listaConLinkEnComun = filtroLinkEnComun.getSimilarPages(pag, wikipedia);
		//assertEquals(0, listaConLinkEnComun.size()); // EL SIZE NO DA 0 CUANDO ES VACIA, DA NULL
		assertEquals( listaConLinkEnComun.size(), 0); 
	}
	
	@Test
	public void testeandoElFiltroDeLinkEnComunPeroHayAlgoEnComun() {
		
		//setup
		WikipediaPage paginaConLinkComun = new WikipediaPage("Historia");
        paginaConLinkComun.agregarPagina(pag2); // Historia -> GameOfThrones
        wikipedia.agregarPagina(paginaConLinkComun); // Historia que linkea GameOfThrones
        
        //wikipedia : Buenos aires -> series , Historia->Game of throne
        //pag : Dragon -> Game of throne
		//exercise
		List<WikipediaPage> listaConLinkEnComun = filtroLinkEnComun.getSimilarPages(pag, wikipedia); // tiene que devolver una lista con la wikipediaPage de Historia
		
		//verify
		assertEquals(1,listaConLinkEnComun.size());
	}
}
