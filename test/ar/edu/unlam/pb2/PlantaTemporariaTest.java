package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaTemporariaTest {
	/*
	 *  Un empleado de Planta Temporaria con 80 horas trabajadas, con esposa 
		y sin hijos. (161.000)
	 */

	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaTemporaria() {
		Integer horasTrabajadas = 80;
		Integer cantidadDeHijos = 0;
		Boolean estaCasado = true;
		Double esperado = 161000.0;
		
		PlantaTemporaria peter = new PlantaTemporaria(horasTrabajadas, cantidadDeHijos, estaCasado);
		Double obtenido = peter.getSueldo();
		assertEquals(esperado, obtenido);
		
	}

}
