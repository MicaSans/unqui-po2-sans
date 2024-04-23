package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoPorHorasExtraTest {

	//Variable de instancia
	private IngresoPorHorasExtras ingresoPorHorasExtras;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		ingresoPorHorasExtras = new IngresoPorHorasExtras("Enero","Horas extras",1000d, 10);
	}

	@Test
	void testIngresoPorHorasExtras() {
		assertEquals(0d,ingresoPorHorasExtras.calcularMontoImponible());
		assertEquals(1000d,ingresoPorHorasExtras.getMontoPercibido());
		assertEquals(10,ingresoPorHorasExtras.getCantidadHorasExtra());
		assertEquals("Enero",ingresoPorHorasExtras.getMesDePercepcion());
		assertEquals("Horas extras",ingresoPorHorasExtras.getConcepto());
	}

}
