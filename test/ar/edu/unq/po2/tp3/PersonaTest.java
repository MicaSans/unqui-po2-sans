package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {

	//Variables de instancia
	private Persona persona1;
	private Persona persona2;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo una persona
		persona1 = new Persona("Juan",LocalDate.of(1991, 10, 9),"Gomez");//Agrego apellido para Ejercicio11
		persona2 = new Persona("Maria",LocalDate.of(1988, 7, 30),"Perez");// Agrego apellido para Ejercicio11
	}

	@Test
	void testEdadPersona() {
		assertEquals(32,persona1.obtenerEdad());
		assertEquals(35,persona2.obtenerEdad());
	}

	@Test
	void testMenorQue() {
		assertTrue(persona1.menorQue(persona2));
	}
	
	@Test
	void testEquipoDeTrabajo() {
		
	}
}
