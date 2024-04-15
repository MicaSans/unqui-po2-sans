package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadradoTest {

	//Variable de instancia
	private Cuadrado cuadrado;
		
	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		Point punto = new Point(0,0); //Punto de origen
		cuadrado = new Cuadrado(punto,4);
	}

	@Test
	void testObtenerArea() {
		assertEquals(16,cuadrado.obtenerArea());
	}
		
	@Test
	void testObtenerPerimetro() {
		assertEquals(16,cuadrado.obtenerPerimetro());
	}
}