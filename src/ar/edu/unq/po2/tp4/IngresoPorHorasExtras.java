package ar.edu.unq.po2.tp4;

public class IngresoPorHorasExtras extends Ingreso {

	//Variable de instancia
	private int cantidadHorasExtra;
	
	//Constructor
	public IngresoPorHorasExtras(String mesPercibido, String conceptoDeLaPercepcion, Double MontoAPercibir, int cantidadHorasExtraTrabajador) {
		super(mesPercibido, conceptoDeLaPercepcion, MontoAPercibir);
		this.setCantidadHorasExtra(cantidadHorasExtraTrabajador);
	}

	//Metodos
	@Override
	public Double calcularMontoImponible() {
		return 0d;
	}

	//Getters y Setters
	public int getCantidadHorasExtra() {
		return cantidadHorasExtra;
	}

	public void setCantidadHorasExtra(int cantidadHorasExtra) {
		this.cantidadHorasExtra = cantidadHorasExtra;
	}
}
