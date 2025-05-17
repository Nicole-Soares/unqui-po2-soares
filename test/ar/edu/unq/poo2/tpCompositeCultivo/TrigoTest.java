package ar.edu.unq.poo2.tpCompositeCultivo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrigoTest {


	//declaro
	private Porcion pura;
	private Porcion pura2;
	private Porcion mixta;
	private Cultivo soja;
	private Cultivo soja1;
	private Cultivo trigo1;
	private Cultivo trigo2;
	private List<Porcion> listaDePorciones;
	
	@BeforeEach
	public void setUp() {
		
		//instancio
		listaDePorciones = new ArrayList<>();
		soja = new CultivoSoja();
		soja1 = new CultivoSoja();
		trigo1 = new CultivoTrigo();
		trigo2 = new CultivoTrigo();
		pura = new PorcionPura(soja);
		pura2 = new PorcionPura(trigo1);
		mixta = new PorcionMixta(listaDePorciones);// recibe una lista de porciones
		listaDePorciones.add(pura);
		listaDePorciones.add(pura);
		listaDePorciones.add(pura);
		listaDePorciones.add(pura2);// es de trigo
		
		
		
	}
	
	@Test
	public void testeandoLaSumaDelTrigoEnUnaPorcionPuraVacia() {
		
		
		assertEquals(0, pura.ganaciaAnualDeTrigo());
	}
	
	@Test
	public void testeandoLaSumaDelTrigoEnUnaPorcionPura() {
		
		
		assertEquals(300, pura2.ganaciaAnualDeTrigo());
	}
	
	@Test
	public void testeandoLaSumaDelTrigoEnUnaPorcionMixta() {
		
		
		assertEquals(75, mixta.ganaciaAnualDeTrigo());
	}
}
