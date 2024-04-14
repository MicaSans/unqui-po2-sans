package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPermanenteTest {

	//Variable de instancia
	private EmpleadoPermanente empleado1;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo un empleado permanente
		empleado1 = new EmpleadoPermanente ("David","Berutti 5772",200000,LocalDate.of(1988, 03, 20),"Divorciado",1,10,true);
		
	}

	@Test
	void testCalcularSueldoBruto() {
		assertEquals(empleado1.calcularSueldoBruto(), 150730);
	}

}
