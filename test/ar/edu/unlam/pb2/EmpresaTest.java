package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmpresaTest {
	
	/*
	 * Una empresa, con el CUIT y Razón Social que desee, y con los 
		cuatro empleados de los escenarios anteriores. (1.554.000)
	 */

	@Test
	public void queSePuedaCrearLaEmpresa() {
		Empresa laPerseverancia = new Empresa("informatica", 1231L);
		PlantaPermanente pedrito = new PlantaPermanente(80, 2, true, 6);
		PlantaPermanente pablito = new PlantaPermanente(160, 0, false, 4);
		PlantaTemporaria mauri = new PlantaTemporaria(80, 0, true);
		Gerente robert = new Gerente(160, 1, true, 10);
		laPerseverancia.agregarEmpleado(pedrito);
		laPerseverancia.agregarEmpleado(pablito);
		laPerseverancia.agregarEmpleado(mauri);
		laPerseverancia.agregarEmpleado(robert);
		
		Double sueldoEsperado = 1554000.0;
		Double sueldoTotalObtenido = laPerseverancia.getSueldoTotal();
		
		assertEquals(sueldoEsperado, sueldoTotalObtenido); 
	}

}
