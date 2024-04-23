package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {

	//Variables de instancia
	private Trabajador trabajadorSinIngresos;
	private Trabajador trabajador1;
	private Trabajador trabajador2;
	private Trabajador trabajador3;
	
	private Ingreso ingresoEnero;
	private Ingreso ingresoFebrero;
	private Ingreso ingresoMarzo;
	private Ingreso ingresoHorasExtra;
	
	private List<Ingreso> lista1;
	private List<Ingreso> lista2;
	private List<Ingreso> lista3;
	private List<Ingreso> listaHorasExtra;
	
	@BeforeEach
	void setUp() throws Exception {
		ingresoEnero = new Ingreso("Enero","Salario",100d);
		ingresoFebrero = new Ingreso("Febrero","Venta auto",1000d);
		ingresoMarzo = new Ingreso("Marzo","Negocio",500d);
		ingresoHorasExtra = new IngresoPorHorasExtras("Octubre", "Horas extras", 200d, 10);
		
		lista1 = new ArrayList<Ingreso>();
		lista2 = new ArrayList<Ingreso>();
		lista3 = new ArrayList<Ingreso>();
		listaHorasExtra = new ArrayList<Ingreso>();
		
		lista1.add(ingresoEnero);
		lista1.add(ingresoFebrero);
		
		lista2.add(ingresoEnero);
		
		lista3.add(ingresoMarzo);
		lista3.add(ingresoEnero);
		lista3.add(ingresoFebrero);
		lista3.add(ingresoHorasExtra);
		
		listaHorasExtra.add(ingresoHorasExtra);
		
		trabajadorSinIngresos = new Trabajador(new ArrayList<Ingreso>());
		trabajador1 = new Trabajador(lista1);
		trabajador2 = new Trabajador(lista2);
		trabajador3 = new Trabajador(lista3);
	}

	@Test
	void testTrabajadorSinIngresos() {
		assertEquals(0,trabajadorSinIngresos.getTotalPercibido());
		assertEquals(0,trabajadorSinIngresos.getImpuestoAPagar());
		assertEquals(0,trabajadorSinIngresos.getMontoImponible());
	}
	
	@Test
	void testTrabajador1() {
		assertEquals(1100,trabajador1.getTotalPercibido());
		assertEquals(22,trabajador1.getImpuestoAPagar());
		assertEquals(1100,trabajador1.getMontoImponible());
	}
	
	@Test
	void testTrabajador2() {
		assertEquals(100,trabajador2.getTotalPercibido());
		assertEquals(2,trabajador2.getImpuestoAPagar());
		assertEquals(100,trabajador2.getMontoImponible());
	}
	
	@Test
	void testTrabajador3() {
		assertEquals(1800,trabajador3.getTotalPercibido());
		assertEquals(32,trabajador3.getImpuestoAPagar());
		assertEquals(1600,trabajador3.getMontoImponible());
	}
}
