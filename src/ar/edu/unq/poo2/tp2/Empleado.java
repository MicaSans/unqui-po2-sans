package ar.edu.unq.poo2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
	//Variables de instancia
	private String nombre;
	private String direccion;
	private float sueldoBasico;
	private LocalDate fechaDeNac;
	private String estadoCivil;
	
	//Constructor
	public Empleado(String nombreEmpleado, String direccionEmpleado, float sueldoBasicoEmpleado, LocalDate fechaDeNacEmpleado, String estadoCivilEmpleado) {
		this.setNombre(nombreEmpleado);
		this.setDireccion(direccionEmpleado);
		this.setSueldoBasico(sueldoBasicoEmpleado);
		this.fechaDeNac = fechaDeNacEmpleado;
		this.setEstadoCivil(estadoCivilEmpleado);
	}
	
	//Setters
	public void setSueldoBasico(float sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	//Getters
	public float getSueldoBasico() {
		return sueldoBasico;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}
	
	//Metodos
	public abstract float calcularObraSocial();
	
	public abstract float calcularAportesJubilatorios();
	
	public abstract float calcularSueldoBruto();
	
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
	
	public float calcularSueldoNeto() {
		float sueldoNeto = this.calcularSueldoBruto() - this.calcularRetenciones();
		return sueldoNeto;
	}
}
