package ar.edu.unq.poo2.tp1;

import java.util.Date;

public class ReciboDeSueldo {
	//Variables de instancia
	private Date fechaDeEmision;
	
	//Constructor
	private ReciboDeSueldo(Date fechaDeEmisionRecibo) {
		this.setFechaDeEmision(fechaDeEmisionRecibo);
	}

	//Getter
	public Date getFechaDeEmision() {
		return fechaDeEmision;
	}

	//Setter
	public void setFechaDeEmision(Date fechaDeEmision) {
		this.fechaDeEmision = fechaDeEmision;
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
}
