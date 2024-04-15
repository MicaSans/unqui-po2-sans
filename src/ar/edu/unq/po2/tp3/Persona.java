package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;

public class Persona {

	//Variables de instancia
	private String nombre;
	private LocalDate fechaDeNacimiento;
	//Agrego apellido para Ejercicio11
	private String apellido;
	
	//Constructores
	public Persona(String nombrePersona, LocalDate fechaNacPersona, String apellidoPersona) { //Agrego apellido para Ejercicio11
		this.nombre = nombrePersona;
		this.fechaDeNacimiento = fechaNacPersona;
		//Agrego apellido para Ejercicio11
		this.setApellido(apellidoPersona);
	}
	
	//Metodos
	public Persona crearPersona(String nombreP, LocalDate fechaNacP, String apellidoP) {
		return new Persona (nombreP, fechaNacP, apellidoP);//Agrego apellido para Ejercicio11
	}
	
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

	//Getter
	public String getApellido() {
		return apellido;
	}

	//Setter
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
