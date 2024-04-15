package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoDeTrabajoTest {

	//Variables de instancia
	private EquipoDeTrabajo equipo;
	private Persona integrante1;
	private Persona integrante2;
	private Persona integrante3;
	private Persona integrante4;
	private Persona integrante5;
	
	@BeforeEach
	void setUp() throws Exception {
		//Creo al equipo
		equipo = new EquipoDeTrabajo("Los vencedores");
		
		//Creo a los integrantes
		integrante1 = new Persona("Susana",LocalDate.of(1970, 05, 20),"Perez");
		integrante2 = new Persona("Carola",LocalDate.of(1985, 11, 2),"Gomez");
		integrante3 = new Persona("Luis",LocalDate.of(1998, 8, 27),"Lopez");
		integrante4 = new Persona("Jose",LocalDate.of(1969, 07, 5),"Gimenez");
		integrante5 = new Persona("Mario",LocalDate.of(2005, 10, 15),"Vinca");
		
		//Agrego los integrantes al equipo
		equipo.agregarIntegrante(integrante1);
		equipo.agregarIntegrante(integrante2);
		equipo.agregarIntegrante(integrante3);
		equipo.agregarIntegrante(integrante4);
		equipo.agregarIntegrante(integrante5);
	}

	@Test
	void testPromedioEdades() {
		float promedio = equipo.obtenerPromedioDeEdadIntegrantes();
		System.out.println("Promedio de edades de los integrantes del equipo " + equipo.obtenerNombreEquipo() + ": " + promedio);
	}
}
