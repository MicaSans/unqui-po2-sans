package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {

	//Variable de instancia
	private Ingreso ingreso;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		ingreso = new Ingreso("Agosto", "Sueldo", 3000d);
	}

	@Test
	void testIngreso() {
		assertEquals(3000d, ingreso.getMontoPercibido());
		assertEquals("Sueldo", ingreso.getConcepto());
		assertEquals("Agosto", ingreso.getMesDePercepcion());
	}
}
