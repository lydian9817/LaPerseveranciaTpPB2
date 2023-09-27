package ar.edu.unlam.pb2;

import java.util.List;
import java.util.ArrayList;

public class Empresa {
	private List<Empleado> empleados;
	private String razonSocial;
	private Long cuit;
	
	public Empresa(String razonSocial, Long cuit) {
		this.razonSocial = razonSocial;
		this.cuit = cuit;
		this.empleados = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}

	public Double getSueldoTotal() {
		Double sueldoTotal = 0.0;
		for(Empleado empleado: empleados) {
			sueldoTotal += empleado.getSueldo();
		}
		return sueldoTotal;
	}
	
}
