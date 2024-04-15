package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp2.EmpleadoPermanente;
import ar.edu.unq.po2.tp2.Empresa;
import ar.edu.unq.po2.tp2.ReciboDeSueldo;

class ReciboDeSueldoTest {

	//Variables de instancia
	private Empresa empresa;
	private EmpleadoPermanente empleado1;
	private ReciboDeSueldo recibo;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo empleado
		empleado1 = new EmpleadoPermanente ("Salvador","Mendoza 458",200000,LocalDate.of(1983, 07, 05),"Casado",2,10,true);
		//Creo empresa
		empresa = new Empresa("CleanHome","23658957584");
		//Creo el recibo de sueldo
	    recibo = new ReciboDeSueldo(LocalDate.of(2024, 03, 02));
	}

	@Test
	void testLiquidacionDeSueldo() {
		System.out.println("Fecha de emision: " + recibo.getFechaDeEmision());
		System.out.println("Nombre empresa: " + empresa.getNombreEmpresa());
		System.out.println("Cuit empresa: " + empresa.getCuitEmpresa());
		System.out.println("------------------------------------------------");
		System.out.println("Nombre de empleado: " + empleado1.getNombre());
		System.out.println("Direccion de empleado: " + empleado1.getDireccion());
		System.out.println("------------------------------------------------");
		System.out.println("Desglose de conceptos:");
		System.out.println("Sueldo basico: " + empleado1.getSueldoBasico());
		System.out.println("Salario familiar: " + empleado1.calcularSalarioFamiliar());
		System.out.println("Antiguedad: " + empleado1.clacularAntiguedad());
		System.out.println("Retenciones por Obra Social: -" + empleado1.calcularObraSocial());
		System.out.println("Retenciones por aportes jubilatorios: -" + empleado1.calcularAportesJubilatorios());
		System.out.println("Total Retenciones: -" + empleado1.calcularRetenciones());
		System.out.println("------------------------------------------------");
		System.out.println("Sueldo bruto de empleado: " + empleado1.calcularSueldoBruto());
		System.out.println("Sueldo neto de empleado: " + empleado1.calcularSueldoNeto());
	}
}
