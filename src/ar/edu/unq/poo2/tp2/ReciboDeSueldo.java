package ar.edu.unq.poo2.tp2;

import java.time.LocalDate;

public class ReciboDeSueldo {
	
	//Variables de instancia
	private LocalDate fechaDeEmision;
	
	//Constructor
	public ReciboDeSueldo(LocalDate fechaDeEmisionRecibo) {
		this.setFechaDeEmision(fechaDeEmisionRecibo);
	}
	
	//Metodos
	public String obtenerNombre(Empleado empleado) {
		return empleado.getNombre();
	}
	
	public String obtenerDireccion(Empleado empleado) {
		return empleado.getDireccion();
	}
	
	public float obtenerSueldoBruto(Empleado empleado) {
		return empleado.getSueldoBasico();
	}
	
	public float obtenerSueldoNeto(Empleado empleado) {
		return empleado.calcularSueldoNeto();
	}

	//Getter
	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}

	//Setter
	public void setFechaDeEmision(LocalDate fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
	}
}
