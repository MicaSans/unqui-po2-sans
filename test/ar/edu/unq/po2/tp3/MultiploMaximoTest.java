package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultiploMaximoTest {
	
	//Variable de instancia
	private Counter contador;

	@BeforeEach
	void setUp() throws Exception {
		//Constructor
		contador = new Counter();
	}

	@Test
	void testMultiploMaximo() {
		int verificar1 = contador.multiplosEntre(3,9);
		int verificar2 = contador.multiplosEntre(5,7);
		assertEquals(verificar1,999);
		assertEquals(verificar2,-1);
	}

}
