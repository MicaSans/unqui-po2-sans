package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.EmpleadoTemporal;

class EmpleadoTemporalTest {

	//Variable de instancia
	private EmpleadoTemporal empleado1;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo al empleado
		empleado1 = new EmpleadoTemporal ("Mirta","Morel 16",250000,LocalDate.of(1967, 05, 11),"Soltera",LocalDate.of(2023, 10, 04),20);
	}

	@Test
	void testCalcularSueldoBrutoEmpleadoTemporal() {
		//Verifico el sueldo bruto del empleado
		assertEquals(empleado1.calcularSueldoBruto(),200675);
	}
}
