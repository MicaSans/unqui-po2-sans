package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	//Variables de instancia
	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	//Constructores
	public Persona(String nombrePersona, LocalDate fechaNacPersona) {
		this.nombre = nombrePersona;
		this.fechaDeNacimiento = fechaNacPersona;
	}
	
	//Metodos
	public String obtenerNombre() {
		return this.nombre;
	}
	
	public LocalDate obtenerFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public int obtenerEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(this.fechaDeNacimiento, fechaActual);
		int edad = periodo.getYears();
		return edad;
	}
	
	public boolean menorQue(Persona persona) {
		if(this.obtenerEdad() < persona.obtenerEdad()) {
			return true;
		}
		return false;
	}
}
