package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GerenteTest {

	@Test
	public void queSePuedaCrearUnGerente() {
		Integer horasTrabajadas = 160;
		Integer cantidadDeHijos = 1;
		Integer antiguedad = 10;
		Boolean estaCasado = true;
		Double esperado = 658000.0;
		
		Gerente peter = new Gerente(horasTrabajadas, cantidadDeHijos, estaCasado, antiguedad);
		Double obtenido = peter.getSueldo();
		assertEquals(esperado, obtenido);
		
	}
}
