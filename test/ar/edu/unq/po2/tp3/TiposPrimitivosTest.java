package ar.edu.unq.po2.tp3;

import org.junit.jupiter.api.Test;

class TiposPrimitivosTest {

	//Variables de instancia
	private int enteroInt;
	private Integer enteroInteger;

	@Test
	void testNumerosEnInstancia() {
		System.out.println("Valor predeterminado en variable de instancia int: " + enteroInt);
		System.out.println("Valor predeterminado en variable de instancia Integer: " + enteroInteger);
	}
	
	@Test
	public void testNumerosEnMetodo() {
		//Variables de metodos
		int numeroInt = enteroInt;
		Integer numeroInteger = enteroInteger;
		//Al ser variables de metodos si o si tengo que inicializarla, no puede ser valor predeterminado, por lo que la inicialice con las variables de instancias creadas para el test anterior
		System.out.println("Valor predeterminado en variable de metodo int: " + numeroInt);
		System.out.println("Valor predeterminado en variable de metodo Integer: " + numeroInteger);
	}
}
