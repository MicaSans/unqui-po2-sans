package ar.edu.unq.poo2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	private Empresa empresa;
	private EmpleadoPermanente empleado1;
	private List<Empleado> empleados;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo empleado
		empleado1 = new EmpleadoPermanente ("Jorge","Olivares 1582",100000,LocalDate.of(1990, 05, 07),"Soltero",0,5,false);
		//Creo empresa
		empresa = new Empresa("CleanHome","23658957584");
		empleados = empresa.getEmpleados();
	}

	@Test
	void testContratarEmpleado() {
		//Verifico que el empleado forme parte de la lista de empleados de la empresa
		empresa.contratarEmpleado(empleado1);
		assertEquals(1, empleados.size());
	}

}
