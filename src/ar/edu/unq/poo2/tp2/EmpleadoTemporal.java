package ar.edu.unq.poo2.tp2;

import java.time.LocalDate;

public class EmpleadoTemporal extends Empleado {
	
	//Variables de instancia
	private LocalDate fechaFinEnPlanta;
	private int cantidadDeHorasExtra;

	//Constructor
	public EmpleadoTemporal(String nombreEmpleado, String direccionEmpleado, float sueldoBasicoEmpleado,
			LocalDate fechaDeNacEmpleado, String estadoCivilEmpleado, LocalDate fechaFinEmpleadoEnPlanta, int cantidadHorasExtraEmpleado) {
		super(nombreEmpleado, direccionEmpleado, sueldoBasicoEmpleado, fechaDeNacEmpleado, estadoCivilEmpleado);
		this.setFechaFinEnPlanta(fechaFinEmpleadoEnPlanta);
		this.cantidadDeHorasExtra = cantidadHorasExtraEmpleado;
	}

	//Metodos
	public int calcularHorasExtra() {
		return cantidadDeHorasExtra * 40;
	}
	
	@Override
	public float calcularObraSocial() {
		float porcentajeSueldoBasico = (this.getSueldoBasico() * 10) / 100;
		int edadEmpleado = this.calcularEdad();
		if (edadEmpleado > 50) {
			porcentajeSueldoBasico = porcentajeSueldoBasico + 25;
		}
		return porcentajeSueldoBasico;
	}

	@Override
	public float calcularAportesJubilatorios() {
		float porcentajeSueldoBasico = (this.getSueldoBasico() * 10) / 100;
		return porcentajeSueldoBasico + (this.cantidadDeHorasExtra * 5);
	}

	@Override
	public float calcularSueldoBruto() {
		float sueldoBruto = this.getSueldoBasico() + this.calcularHorasExtra() - this.calcularRetenciones();
		return sueldoBruto;
	}

	//Getters
	public LocalDate getFechaFinEnPlanta() {
		return fechaFinEnPlanta;
	}
	
	public float getSueldoBasico() {
		return super.getSueldoBasico();
	}

	//Setters
	public void setFechaFinEnPlanta(LocalDate fechaFinEnPlanta) {
		this.fechaFinEnPlanta = fechaFinEnPlanta;
	}

}
