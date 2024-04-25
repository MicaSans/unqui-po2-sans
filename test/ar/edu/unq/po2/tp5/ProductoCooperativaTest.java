package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoCooperativaTest {

	//Variables de Instancia
	private ProductoCooperativa producto1;
	private ProductoCooperativa producto2;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructores
		producto1 = new ProductoCooperativa("fideos", 200d, 5, 10);
		producto2 = new ProductoCooperativa("polenta", 100d, 2, 10);
	}

	@Test
	void testProducto1() {
		//Se testea que los metodos den como resultado los valores asignados al producto1, sobretodo el precioBase con el descuento aplicado
		assertEquals("fideos", producto1.getNombre());
		assertEquals(5, producto1.getStock());
		assertEquals(180d, producto1.getPrecioBase());
	}
	
	@Test
	void testProducto2() {
		//Se testea que los metodos den como resultado los valores asignados al producto2, sobretodo el precioBase con el descuento aplicado
		assertEquals("polenta", producto2.getNombre());
		assertEquals(2, producto2.getStock());
		assertEquals(90d, producto2.getPrecioBase());
	}

}
