package ar.edu.unq.poo2.tp1;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	private String nombre;
	private String direccion;
	private float sueldoBasico;
	private LocalDate fechaDeNac;
	private String estadoCivil;
	
	public Empleado(String nombreEmpleado, String direccionEmpleado, float sueldoBasicoEmpleado, LocalDate fechaDeNacEmpleado, String estadoCivilEmpleado) {
		this.setNombre(nombreEmpleado);
		this.setDireccion(direccionEmpleado);
		this.setSueldoBasico(sueldoBasicoEmpleado);
		this.fechaDeNac = fechaDeNacEmpleado;
		this.setEstadoCivil(estadoCivilEmpleado);
	}
	
	public int calcularEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaDeNac, fechaActual);
		int edad = periodo.getYears();
		
		return edad;
	}
	
	public float calcularRetenciones() {
		float retenciones = this.calcularObraSocial() + this.calcularAportesJubilatorios();
		
		return retenciones;
	}
	
	public abstract float calcularObraSocial();
	public abstract float calcularAportesJubilatorios();
	public abstract float calcularSueldoBruto();
	
	public float calcularSueldoNeto() {
		float sueldoNeto = this.calcularSueldoBruto() - this.calcularRetenciones();
		return sueldoNeto;
	}

	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
}
