package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testNuevoPuntoPredeterminado() {
		//Constructor
		Point punto = new Point();
		//Verificacion
		assertEquals(0,punto.getX());
		assertEquals(0,punto.getY());
	}

	@Test
	void testNuevoPuntoConParametros() {
		//Constructor
		Point punto = new Point(2,4);
		//Verificacion
		assertEquals(2,punto.getX());
		assertEquals(4,punto.getY());
	}
	
	@Test
	void testPuntosSumados() {
		//Constructores
		Point punto1 = new Point(1,2);
		Point punto2 = new Point(2,3);
		//Metodo
		Point nuevoPunto = punto1.sumarConOtroPunto(punto2.getX(), punto2.getY());
		//Verificacion
		assertEquals(3,nuevoPunto.getX());
		assertEquals(5,nuevoPunto.getY());
	}
}
