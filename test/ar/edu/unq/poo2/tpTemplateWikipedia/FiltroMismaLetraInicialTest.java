package ar.edu.unq.poo2.tpTemplateWikipedia;




import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class FiltroMismaLetraInicialTest {

	private WikipediaPage pag;
	private WikipediaPage pag1;
	private Filtro filtroMismaLetra;
	private WikipediaWeb wikipedia; 

	@BeforeEach
	public void setUp() {
		 pag = new WikipediaPage("Dragon");
		 pag1 = new WikipediaPage("Dinosaurio");
		 filtroMismaLetra = new FiltroMismaLetra();
		 wikipedia = new WikipediaWeb(filtroMismaLetra);
		 wikipedia.agregarPagina(pag);
		 wikipedia.agregarPagina(pag1);
		
	}
	
	@Test
	public void testearSiDevuelveListaDeCoincidenciasPorPrimeraLetra(){
		
		List<WikipediaPage>listaDeParecidos = filtroMismaLetra.getSimilarPages(pag1, wikipedia);
		
		assertEquals(2, listaDeParecidos.size());
	}
	
}
