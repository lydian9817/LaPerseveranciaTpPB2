package ar.edu.unlam.pb2;

public class PlantaTemporaria extends Empleado {

	private static final Double VALOR_HORA = 2000.0;
	
	private Integer horasTrabajadas;
	private Integer cantidadDeHijos;
	private Boolean estaCasado;

	public PlantaTemporaria(Integer horasTrabajadas, Integer cantidadDeHijos, Boolean estaCasado) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = cantidadDeHijos;
		this.estaCasado = estaCasado;
	}

	public Double getSueldo() {
		return this.horasTrabajadas * PlantaTemporaria.VALOR_HORA + super.getSalarioFamiliar(cantidadDeHijos, estaCasado);
	}
}
