package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ImpuestoTest {

	//Variables de instancia
	private Factura impuesto;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		impuesto = new Impuesto("ARBA", 5000d);
	}

	@Test
	void testImpuesto() {
		//Se testea que los metodos den como resultado los valores asignados al impuesto
		assertEquals("ARBA", impuesto.getNombre());
		assertEquals(5000d, impuesto.getImporte());
	}
	
	@Test
	void testMontoAPagar() {
		//Se testea que calcule bien el monto total a pagar del servicio en base a la cantidad de unidades
		assertEquals(5000d, impuesto.calcularMontoAPagar());
	}
}
