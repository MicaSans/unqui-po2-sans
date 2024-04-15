package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DigitosParesTest {

	//Variable de instancia
	private Counter contador;
	
	@BeforeEach
	public void setUp() throws Exception {
		//Constructor
		contador = new Counter();
		
		//Se agregan los numeros
		contador.addNumber(12);
		contador.addNumber(35);
		contador.addNumber(51);
		contador.addNumber(756);
		contador.addNumber(934);
		contador.addNumber(1665);
		contador.addNumber(1347);
		contador.addNumber(1);
		contador.addNumber(284536);
		contador.addNumber(4);
	}

	@Test
	public void testDigitosPares() {
		int verificar = contador.mayorNumeroConDigitosPares();
		assertEquals(verificar,284536);
	}

}
