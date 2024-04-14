package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoContratadoTest {

	//Variable de instancia
	private EmpleadoContratado empleado1;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo un empleado
		empleado1 = new EmpleadoContratado ("Alberto","Andres Baranda 589",100000,LocalDate.of(2002, 01, 03),"Soltero",256,"Transferencia");
	}

	@Test
	void testSueldoBruto() {
		assertEquals(empleado1.calcularSueldoBruto(), empleado1.getSueldoBasico());
	}
	
	@Test
	void testSueldoNeto() {
		assertEquals(99950, empleado1.calcularSueldoNeto());
	}

}
