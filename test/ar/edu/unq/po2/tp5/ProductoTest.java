package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {

	//Variables de instancia
	private Producto producto1;
	private Producto producto2;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructores
		producto1 = new Producto("chocolate", 500d, 10);
		producto2 = new Producto("manteca", 300d, 5);
	}

	@Test
	void testProducto1() {
		//Se testea que los metodos den como resultado los valores asignados al producto1
		assertEquals("chocolate", producto1.getNombre());
		assertEquals(500d, producto1.getPrecioBase());
		assertEquals(10, producto1.getStock());
	}
	
	@Test
	void testProducto2() {
		//Se testea que los metodos den como resultado los valores asignados al producto2
		assertEquals("manteca", producto2.getNombre());
		assertEquals(300d, producto2.getPrecioBase());
		assertEquals(5, producto2.getStock());
	}

}
