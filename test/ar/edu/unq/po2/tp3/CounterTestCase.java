package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	//Variable de instancia
	private Counter counter;
	
	/**
	 * Crea un escenario de test basico, que consiste en un contador con 10 enteros
	 * @throws Exception
	 */
	
	@BeforeEach
	void setUp() throws Exception {
		//Se crea el contador
		counter = new Counter();
		
		//Se agregan los numeros. Un solo par y nueve inpares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	@Test
	public void testEvenNumbers() {
		int amount = counter.getEvenOcurrences();
		assertEquals(amount,9);
	}

}
