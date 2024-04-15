package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MultioperadorTest {

	@Test
	void testSuma() {
		
		Multioperador operador = new Multioperador();
		
		//Agrego numeros a la lista
		operador.agregarNumero(5);
		operador.agregarNumero(2);
		operador.agregarNumero(3);
		
		//Obtengo la lista de numeros del operador
		ArrayList<Integer> numeros = operador.getOperador();
				
		assertEquals(10,operador.sumarNumeros(numeros));
	}
	
	@Test
	void testResta() {
		Multioperador operador = new Multioperador();
		
		//Agrego numeros a la lista
		operador.agregarNumero(5);
		operador.agregarNumero(2);
		operador.agregarNumero(3);
		
		//Obtengo la lista de numeros del operador
		ArrayList<Integer> numeros = operador.getOperador();
				
		assertEquals(0,operador.restarNumeros(numeros));
	}
	
	@Test
	void testMultiplicacion() {
		Multioperador operador = new Multioperador();
		
		//Agrego numeros a la lista
		operador.agregarNumero(5);
		operador.agregarNumero(2);
		operador.agregarNumero(3);
		
		//Obtengo la lista de numeros del operador
		ArrayList<Integer> numeros = operador.getOperador();
				
		assertEquals(30,operador.multiplicarNumeros(numeros));
	}
}
