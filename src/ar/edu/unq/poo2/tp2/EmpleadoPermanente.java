package ar.edu.unq.poo2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
	
	private int cantidadDeHijos;
	private int antiguedad;
	private boolean conyuge;

	public EmpleadoPermanente(String nombreEmpleado, String direccionEmpleado, float sueldoBasicoEmpleado,
			LocalDate fechaDeNacEmpleado, String estadoCivilEmpleado, int cantidadDeHijosEmpleado, int antiguedadEmpleado, boolean tieneConyuge) {
		super(nombreEmpleado, direccionEmpleado, sueldoBasicoEmpleado, fechaDeNacEmpleado, estadoCivilEmpleado);
		// TODO Auto-generated constructor stub
		this.cantidadDeHijos = cantidadDeHijosEmpleado;
		this.antiguedad = antiguedadEmpleado;
		this.conyuge = tieneConyuge;
	}
	
	public float calcularSalarioFamiliar() {
		float asignacionPorHijo = this.cantidadDeHijos * 150;
		int tieneConyuge = 0;
		
		if (this.conyuge) {
			tieneConyuge = 1;
		};
		float asignacionPorConyuge = tieneConyuge * 100;
		
		return asignacionPorHijo + asignacionPorConyuge;
	}
	
	public float clacularAntiguedad() {
		return this.antiguedad * 50;
	}

	@Override
	public float calcularObraSocial() {
		// TODO Auto-generated method stub
		float porcentajeSueldoBasico = (this.getSueldoBasico() * 10) / 100;
		int importePorHijo = this.cantidadDeHijos * 20;
		
		return porcentajeSueldoBasico + importePorHijo;
	}

	@Override
	public float calcularAportesJubilatorios() {
		// TODO Auto-generated method stub
		float porcentajeSueldoBasico = (this.getSueldoBasico() * 15) / 100;
		return porcentajeSueldoBasico;
	}

	@Override
	public float calcularSueldoBruto() {
		// TODO Auto-generated method stub
		float sueldoBruto = this.getSueldoBasico() + this.calcularSalarioFamiliar() + this.clacularAntiguedad() - this.calcularRetenciones();
		return sueldoBruto;
	}
	
}
