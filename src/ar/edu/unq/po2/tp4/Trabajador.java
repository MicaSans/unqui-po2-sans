package ar.edu.unq.po2.tp4;

import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresosPercibidos;
	
	//Constructor
	public Trabajador(List<Ingreso> ingresosPercibidos) {
		this.ingresosPercibidos = ingresosPercibidos;
	}
	
	//Metodos
	public void agregarIngreso(Ingreso ingresoAAgregar) {
		this.ingresosPercibidos.add(ingresoAAgregar);
	}
	
	public void quitarIngreso(Ingreso ingresoAQuitar) {
		this.ingresosPercibidos.remove(ingresoAQuitar);
	}
	
	public Double getTotalPercibido() {
		Double totalPercibido = 0d;
		for(Ingreso ingreso : ingresosPercibidos) {
			totalPercibido += ingreso.getMontoPercibido();
		}
		return totalPercibido;
	}
	
	public Double getMontoImponible() {
		Double montoImponible = 0d;
		for (Ingreso ingreso : ingresosPercibidos) {
			if(!(ingreso instanceof IngresoPorHorasExtras)) {
				montoImponible += ingreso.calcularMontoImponible();
			}
		}
		return montoImponible;
	}
	
	public Double getImpuestoAPagar() {
		return (this.getMontoImponible() * 2) / 100;
	}
}
