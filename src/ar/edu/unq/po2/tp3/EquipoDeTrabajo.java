package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {

	//Variables de instancia
	private String nombre;
	private List<Persona> integrantes;
	
	//Constructor
	public EquipoDeTrabajo(String nombreEquipo) {
		this.nombre = nombreEquipo;
		this.integrantes = new ArrayList<Persona>();
	}
	
	//Metodos
	public void agregarIntegrante(Persona persona) {
		integrantes.add(persona);
	}
	
	public void sacarIntegrante(Persona persona) {
		integrantes.remove(persona);
	}
	
	public String obtenerNombreEquipo() {
		return this.nombre;
	}
	
	public float obtenerPromedioDeEdadIntegrantes() {
		float sumarEdades = 0;
		for(Persona persona : integrantes) {
			sumarEdades += persona.obtenerEdad();
		}
		return sumarEdades / integrantes.size();
	}
}
