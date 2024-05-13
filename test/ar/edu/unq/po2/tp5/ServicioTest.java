package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ServicioTest {

	//Variables de instancia
	private Factura servicio;
		
	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		servicio = new Servicio("Movistar", 23000d, 2);
	}

	@Test
	void testImpuesto() {
		//Se testea que los metodos den como resultado los valores asignados al servicio
		assertEquals("Movistar", servicio.getNombre());
		assertEquals(23000d, servicio.getImporte());
	}
	
	@Test
	void testMontoAPagar() {
		//Se testea que calcule bien el monto total a pagar del servicio en base a la cantidad de unidades
		assertEquals(46000d, servicio.calcularMontoAPagar());
	}
}
