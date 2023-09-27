package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlantaPermanenteTest {

	/*
	 *  Un empleado de Planta Permanente (que no sea gerente) con 80 horas 
		trabajadas, con esposa, 2 hijos y 6 años de antigüedad. (251.000)
	 */
	@Test
	public void queSePuedaCrearUnEmpleadoDePlantaPermanente() {
		Integer horasTrabajadas = 80;
		Integer cantidadDeHijos = 2;
		Integer antiguedad = 6;
		Boolean estaCasado = true;
		Double esperado = 251000.0;
		
		PlantaPermanente peter = new PlantaPermanente(horasTrabajadas, cantidadDeHijos, estaCasado, antiguedad);
		Double obtenido = peter.getSueldo();
		assertEquals(esperado, obtenido);
		
	}
	
	/*
	 *  Un empleado de Planta Permanente (que no sea gerente) con 160 horas 
	trabajadas, sin esposa, sin hijos y con 4 años de antigüedad. (484.000)
	 */
	
	@Test
	public void queSePuedaCrearOtrEmpleadoDePlantaPermanenteSinHijos() {
		Integer horasTrabajadas = 160;
		Integer cantidadDeHijos = 0;
		Integer antiguedad = 4;
		Boolean estaCasado = false;
		Double esperado = 484000.0;
		
		PlantaPermanente peter = new PlantaPermanente(horasTrabajadas, cantidadDeHijos, estaCasado, antiguedad);
		Double obtenido = peter.getSueldo();
		assertEquals(esperado, obtenido);
		
	}

}
