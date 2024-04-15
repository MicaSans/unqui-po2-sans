package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectanguloTest {

	//Variable de instancia
	private Rectangulo rectangulo;
	
	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		Point punto = new Point(0,0); //Punto de origen
		rectangulo = new Rectangulo(punto,4,2);
	}

	@Test
	void testObtenerArea() {
		assertEquals(8,rectangulo.obtenerArea());
	}
	
	@Test
	void testObtenerPerimetro() {
		assertEquals(12,rectangulo.obtenerPerimetro());
	}

	@Test
	void testEsHorizontal() {
		assertTrue(rectangulo.esHorizontal());
	}
	
	@Test
	void testNoEsVertical() {
		assertFalse(rectangulo.esVertical());
	}
	
	@Test
	void testEsVertical() {
		//Modifico el rectangulo para que sea vertical
		rectangulo.setAlto(4);
		rectangulo.setAncho(2);
		assertTrue(rectangulo.esVertical());
	}
}
