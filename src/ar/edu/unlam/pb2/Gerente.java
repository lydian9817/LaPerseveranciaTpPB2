package ar.edu.unlam.pb2;

public class Gerente extends PlantaPermanente {
	private static final Double VALOR_HORA = 4000.0;
	private static final Double VALOR_ANTIGUEDAD = 1500.0;
	
	private Integer horasTrabajadas;
	private Integer cantidadDeHijos;
	private Boolean estaCasado;
	private Integer antiguedad;

	public Gerente(Integer horasTrabajadas, Integer cantidadDeHijos, Boolean estaCasado, Integer antiguedad) {
		super(horasTrabajadas, cantidadDeHijos, estaCasado, antiguedad);
		
		this.horasTrabajadas = horasTrabajadas;
		this.cantidadDeHijos = cantidadDeHijos;
		this.estaCasado = estaCasado;
		this.antiguedad = antiguedad;
	}

	public Double getSueldo() {
		return this.horasTrabajadas * VALOR_HORA +
				this.antiguedad * VALOR_ANTIGUEDAD +
				super.getSalarioFamiliar(this.cantidadDeHijos, this.estaCasado);
	}
}
