package ar.edu.unq.po2.tp4;

public class Ingreso {

	//Variables de instancia
	private String mesDePercepcion;
	private String concepto;
	private Double montoPercibido;
	
	//Constructor
	public Ingreso(String mesPercibido, String conceptoDeLaPercepcion, Double MontoAPercibir) {
		this.setMesDePercepcion(mesPercibido);
		this.setConcepto(conceptoDeLaPercepcion);
		this.setMontoPercibido(MontoAPercibir);
	}
	
	//Metodos
	public Double calcularMontoImponible() {
		return this.getMontoPercibido();
	}

	//Getters y Setters
	public Double getMontoPercibido() {
		return montoPercibido;
	}

	public void setMontoPercibido(Double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}

	public String getMesDePercepcion() {
		return mesDePercepcion;
	}

	public void setMesDePercepcion(String mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
}
