package ar.edu.unq.poo2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {
	
	private LocalDate fechaFinEnPlanta;
	private int cantidadDeHorasExtra;

	public EmpleadoTemporal(String nombreEmpleado, String direccionEmpleado, float sueldoBasicoEmpleado,
			LocalDate fechaDeNacEmpleado, String estadoCivilEmpleado, LocalDate fechaFinEmpleadoEnPlanta, int cantidadHorasExtraEmpleado) {
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
		float porcentajeSueldoBasico = (this.getSueldoBasico() * 10) / 100;
		int edadEmpleado = this.calcularEdad();
		if (edadEmpleado > 50) {
			porcentajeSueldoBasico = porcentajeSueldoBasico + 25;
		}
		return porcentajeSueldoBasico;
	}

	@Override
	public float calcularAportesJubilatorios() {
		// TODO Auto-generated method stub
		float porcentajeSueldoBasico = (this.getSueldoBasico() * 10) / 100;
		return porcentajeSueldoBasico + (this.cantidadDeHorasExtra * 5);
	}

	@Override
	public float calcularSueldoBruto() {
		// TODO Auto-generated method stub
		float sueldoBruto = this.getSueldoBasico() + this.calcularHorasExtra() - this.calcularRetenciones();
		return sueldoBruto;
	}

	public LocalDate getFechaFinEnPlanta() {
		return fechaFinEnPlanta;
	}

	public void setFechaFinEnPlanta(LocalDate fechaFinEnPlanta) {
		this.fechaFinEnPlanta = fechaFinEnPlanta;
	}
	
	public float getSueldoBasico() {
		return super.getSueldoBasico();
	}

}
