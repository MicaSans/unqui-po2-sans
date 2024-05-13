package ar.edu.unq.po2.tp5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgenciaTest {

	//Variables de instancia
	private Factura impuesto;
	private Factura servicio;
		
	@BeforeEach
	void setUp() throws Exception {
		//Constructores
		impuesto = new Impuesto("Municipal", 6000d);	
		servicio = new Servicio("Flow", 1200d, 10);
	}

	@Test
	void testRegistrarImpuestoEnAgencia() {
		//Se testea que se imprima en consola lo que corresponde
		impuesto.registrarPago(impuesto);
	}

	@Test
	void testRegistrarServicioEnAgencia() {
		//Se testea que se imprima en consola lo que corresponde
		servicio.registrarPago(servicio);
	}
}
