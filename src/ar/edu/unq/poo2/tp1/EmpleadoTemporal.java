package ar.edu.unq.poo2.tp1;

import java.time.LocalDate;
import java.util.Date;

public class EmpleadoTemporal extends Empleado {
	
	private Date fechaFinEnPlanta;
	private int cantidadDeHorasExtra;

	public EmpleadoTemporal(String nombreEmpleado, String direccionEmpleado, float sueldoBasicoEmpleado,
			LocalDate fechaDeNacEmpleado, String estadoCivilEmpleado, Date fechaFinEmpleadoEnPlanta, int cantidadHorasExtraEmpleado) {
		super(nombreEmpleado, direccionEmpleado, sueldoBasicoEmpleado, fechaDeNacEmpleado, estadoCivilEmpleado);
		// TODO Auto-generated constructor stub
		this.setFechaFinEnPlanta(fechaFinEmpleadoEnPlanta);
		this.cantidadDeHorasExtra = cantidadHorasExtraEmpleado;
	}

	public int calcularHorasExtra() {
		return cantidadDeHorasExtra * 40;
	}
	
	@Override
	public float calcularObraSocial() {
		// TODO Auto-generated method stub
		float porcentajeSueldoBruto = (this.calcularSueldoBruto() * 10) / 100;
		int edadEmpleado = this.calcularEdad();
		if (edadEmpleado > 50) {
			porcentajeSueldoBruto = porcentajeSueldoBruto + 25;
		}
		
		return porcentajeSueldoBruto;
	}

	@Override
	public float calcularAportesJubilatorios() {
		// TODO Auto-generated method stub
		float porcentajeSueldoBruto = (this.calcularSueldoBruto() * 10) / 100;
		return porcentajeSueldoBruto + (this.cantidadDeHorasExtra * 5);
	}

	@Override
	public float calcularSueldoBruto() {
		// TODO Auto-generated method stub
		float sueldoBruto = this.getSueldoBasico() + this.calcularHorasExtra() - this.calcularRetenciones();
		return sueldoBruto;
	}

	public Date getFechaFinEnPlanta() {
		return fechaFinEnPlanta;
	}

	public void setFechaFinEnPlanta(Date fechaFinEnPlanta) {
		this.fechaFinEnPlanta = fechaFinEnPlanta;
	}
	
	//public float getSueldoBasico() {
	//	return super.getSueldoBasico();
	//}

}
