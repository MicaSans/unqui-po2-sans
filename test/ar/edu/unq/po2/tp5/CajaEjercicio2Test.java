package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaEjercicio2Test {

	//Variables de instancia
	private Factura factura;
	private Caja caja;
	private Producto producto;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructores
		factura = new Impuesto("ARQUI", 11000d);
		caja = new Caja();
		producto = new Producto("Alfajor", 1000d, 5);
	}

	@Test
	void testCajaEjercicio2() {
		//Se testea que la caja esta calculando bien el monto total que se debe abonar en el caso de llevar un producto y abonar una factura
		caja.registrarProducto(producto);
		caja.registrarFactura(factura);
		assertEquals(12000d, caja.getMontoTotal());
	}
}
