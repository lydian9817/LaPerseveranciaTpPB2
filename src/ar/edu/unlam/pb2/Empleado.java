package ar.edu.unlam.pb2;

public abstract class Empleado {
	
	protected static final Double VALOR_HIJO = 2000.0;
	protected static final Double VALOR_CONYUGUE = 1000.0;
	
	protected abstract Double getSueldo();
	
	protected Double getSalarioFamiliar(Integer cantidadDeHijos, Boolean estaCasado) {
		Double salarioFamiliar = cantidadDeHijos * VALOR_HIJO;
		if(estaCasado) {
			salarioFamiliar += VALOR_CONYUGUE;
		}
		return salarioFamiliar;
	}
}
