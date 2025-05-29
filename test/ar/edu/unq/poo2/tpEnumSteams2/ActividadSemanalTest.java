package ar.edu.unq.poo2.tpEnumSteams2;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.poo2.tpEnumStreams2.ActividadSemanal;
import ar.edu.unq.poo2.tpEnumStreams2.Deporte;
import ar.edu.unq.poo2.tpEnumStreams2.DiaDeLaSemana;
import ar.edu.unq.poo2.tpEnumStreams2.Municipio;

public class ActividadSemanalTest {

	private ActividadSemanal actividadUno;
	private ActividadSemanal actividadDos;
	private List<ActividadSemanal> listaDeActividades;
	private Deporte	futbol;
	private Deporte	running;
	private DiaDeLaSemana dia;
	int complejidad;
	Deporte deporteBuscado;
	private Municipio municipio;
	
	@BeforeEach
	public void setUp() {
		futbol = Deporte.FUTBOL;
		running = Deporte.RUNNING;
		dia = DiaDeLaSemana.LUNES;
		actividadUno = new ActividadSemanal(dia,12,120, futbol);
		actividadDos = new ActividadSemanal(dia,12,120, running);
		
		listaDeActividades = Arrays.asList(actividadUno, actividadDos);
		complejidad = 2;
		deporteBuscado = Deporte.FUTBOL;
		municipio = new Municipio(listaDeActividades);
	}
	
	@Test
	public void testeandoLaListaQueSoloTieneActividadFutbol() {
		
		List<ActividadSemanal> actividadesFutbol = listaDeActividades.stream()
	            .filter(actividad -> actividad.getDeporte() == Deporte.FUTBOL)
	            .collect(Collectors.toList());
		
		assertEquals(1, actividadesFutbol.size());
	}
	
	@Test
	public void testeandoPorComplejidad() {
		List<ActividadSemanal> actividadesPorComplejidad = listaDeActividades.stream()
	            .filter(actividad -> actividad.getDeporte().getComplejidad() == complejidad)
	            .collect(Collectors.toList());
		
		System.out.println(actividadesPorComplejidad);
		assertEquals(1, actividadesPorComplejidad.size());
	}
	
	@Test
	public void testeandoCantidadDeHorasTotales() {
		// 2. Calcular suma manual para verificación
	    int sumaManual = 0;
	    for (ActividadSemanal actividad : listaDeActividades) {
	        if (actividad != null) {
	            sumaManual += actividad.getDuracion();
	        }
	    }
		
		assertEquals(240, sumaManual);
	}
	
	@Test
	public void testeandoActividadMensualDeMenorCosto() {
		
		
		Optional<ActividadSemanal> actividadDeMenorCosto = listaDeActividades.stream()
                .filter(actividad -> actividad.getDeporte().equals(deporteBuscado)) // Usa .equals() para comparación de objetos
                .min(Comparator.comparingDouble(ActividadSemanal::costo));
		
		// PASO 1: VERIFICAR QUE EL OPTIONAL TIENE UN VALOR
       assertTrue(actividadDeMenorCosto.isPresent());

        // PASO 2: EXTRAER EL OBJETO ActividadSemanal DEL OPTIONAL USANDO .get()
        ActividadSemanal actividadEncontrada = actividadDeMenorCosto.get();

        // PASO 3: AHORA SÍ PUEDES LLAMAR A getDeporte() Y costo() EN EL OBJETO ActividadSemanal
        org.junit.jupiter.api.Assertions.assertEquals(Deporte.FUTBOL, actividadEncontrada.getDeporte(),
                "La actividad de menor costo encontrada debería ser del deporte RUNNING.");
        
		assertEquals(Deporte.FUTBOL, actividadEncontrada.getDeporte());
	}

	@Test
	public void testeandoLasActividadesConLosPreciosMasBajos() {
		// Opción 2: Usar collectingAndThen para obtener directamente un Map<Deporte, ActividadSemanal>
        // Esto asume que SIEMPRE habrá al menos una actividad por deporte.
        // Si no hubiera, se lanzaría un NoSuchElementException al hacer .get().
        // Por eso, la Opción 1 es a menudo más segura si no estás 100% seguro de la presencia.
        Map<Deporte, ActividadSemanal> actividadesMasEconomicasPorDeporte =
            listaDeActividades.stream()
                .collect(Collectors.groupingBy(
                    ActividadSemanal::getDeporte,
                    Collectors.collectingAndThen( // Aplica una función de "finalización"
                        Collectors.minBy(Comparator.comparingDouble(ActividadSemanal::costo)), // El colector original (devuelve Optional)
                        Optional::get // La función final: extrae el valor del Optional (asume que siempre está presente)
                    )
                ));
        
        assertEquals(2, actividadesMasEconomicasPorDeporte.size());
	}
	
	@Test
	public void testeandoTodasLasActividadesRealizadasPorElMunicipio() {
		assertEquals(2, municipio.cantidadDeActividades());
	}
	
	@Test
	public void testeandoImpresion() {
		municipio.imprimirActividades();
	}
}
