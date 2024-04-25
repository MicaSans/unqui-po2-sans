package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {

	//Variables de Instancia
	private Producto producto1;
	private ProductoCooperativa producto2;
	private Caja cajaDelSuper;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructores
		producto1 = new Producto("chocolate", 500d, 10);
		producto2 = new ProductoCooperativa("polenta", 100d, 2, 10);
		cajaDelSuper = new Caja();
	}

	@Test
	void testCaja() {
		//Se testea que la caja esta calculando bien el monto total que se debe abonar en el caso de llevar productos de distintas clases
		cajaDelSuper.registrarProducto(producto1);
		cajaDelSuper.registrarProducto(producto2);
		assertEquals(590d, cajaDelSuper.getMontoTotal());
	}
	
	@Test
	void testSinStock() {
		//Se testea que aparezca en consola el error "Producto sin stock" al querer registrar mas productos que los que hay en stock en el caso de producto2
		cajaDelSuper.registrarProducto(producto2);
		cajaDelSuper.registrarProducto(producto2);
		cajaDelSuper.registrarProducto(producto2);
	}

}
