package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {

	//Variable de instancia
	private EmpleadoTemporal empleado1;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo empleado y empresa
		empleado1 = new EmpleadoTemporal ("Susana","Moreno 852",150000,LocalDate.of(1985, 10, 12),"Casada",LocalDate.of(2024, 04, 10),10);
	}

	@Test
	void testDeEdad() {
		//Verifico que el calculo de la edad sea correcto
		assertEquals(38, empleado1.calcularEdad());
	}

}
