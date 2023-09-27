package ar.edu.unlam.pb2;

public class PlantaPermanente extends Empleado {
	
	private static final Double VALOR_HORA = 3000.0;
	private static final Double VALOR_ANTIGUEDAD = 1000.0;
	
	private Integer horasTrabajadas;
	private Integer cantidadDeHijos;
	private Boolean estaCasado;
	private Integer antiguedad;

	public PlantaPermanente(Integer horasTrabajadas, Integer cantidadDeHijos, Boolean estaCasado, Integer antiguedad) {
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = cantidadDeHijos;
		this.estaCasado = estaCasado;
		this.antiguedad = antiguedad;
	}

	public Double getSueldo() {
		return this.horasTrabajadas * PlantaPermanente.VALOR_HORA +
				this.antiguedad * PlantaPermanente.VALOR_ANTIGUEDAD +
				super.getSalarioFamiliar(cantidadDeHijos, estaCasado);
	}
}
