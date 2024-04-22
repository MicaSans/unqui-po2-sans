package ar.edu.unq.po2.tp2;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {

	//Variables de instancia
	private Empresa empresa;
	private EmpleadoPermanente empleado1;
	private EmpleadoTemporal empleado2;
	private List<Empleado> empleados;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo empleados
		empleado1 = new EmpleadoPermanente ("Jorge","Olivares 1582",100000,LocalDate.of(1990, 05, 07),"Soltero",0,5,false);
		empleado2 = new EmpleadoTemporal ("Marcos","Brown 1623",120000,LocalDate.of(2000, 03, 02),"Soltero",LocalDate.of(2023, 11, 01),10);
		//Creo empresa
		empresa = new Empresa("CleanHome","23658957584");
		empleados = empresa.getEmpleados();
		//Agrego empleados
	    empresa.contratarEmpleado(empleado1);
	    empresa.contratarEmpleado(empleado2);
}

	@Test
	void testContratarEmpleado() {
		//Verifico que los empleados formen parte de la lista de empleados de la empresa
		assertEquals(2, empleados.size());
	}

	@Test
	void testCalcularTotalSueldosNetos() {
		System.out.println("Total sueldos netos: " + empresa.totalSueldosNetos());
	}
	
	@Test
	void testCalcularSueldosBrutos() {
		System.out.println("Total sueldos brutos: " + empresa.totalSueldosBrutos());
	}
	
	@Test
	void testCalcularRetenciones() {
		System.out.println("Total retenciones: " + empresa.totalRetenciones());
	}
}
