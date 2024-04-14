package ar.edu.unq.poo2.tp2;

import java.time.LocalDate;

public class EmpleadoContratado extends Empleado {
	
	//Variables de instancia
	private int numeroDeContrato;
	private String medioDePago;
	
	//Constructor
	public EmpleadoContratado(String nombreEmpleado, String direccionEmpleado, float sueldoBasicoEmpleado,
			LocalDate fechaDeNacEmpleado, String estadoCivilEmpleado, int numeroDeContratoEmpleado, String medioDePagoEmpleado) {
		super(nombreEmpleado, direccionEmpleado, sueldoBasicoEmpleado, fechaDeNacEmpleado, estadoCivilEmpleado);
		this.setNumeroDeContrato(numeroDeContratoEmpleado);
		this.setMedioDePago(medioDePagoEmpleado);
	}

	//Metodos
	public int gastosAdministrativosContractuales() {
		return 50;
	}
	
	@Override
	public float calcularSueldoBruto() {
		return this.getSueldoBasico();
	}
	
	@Override
	public float calcularSueldoNeto() {
		float sueldoNeto = this.calcularSueldoBruto() - this.gastosAdministrativosContractuales();
		return sueldoNeto;
	}

	@Override
	public float calcularObraSocial() {
		//No hacer nada o lanzar una excepcion porque esta subclase no utiliza este metodo
	    throw new UnsupportedOperationException("Este metodo no es necesario en esta subclase");
	}

	@Override
	public float calcularAportesJubilatorios() {
		//No hacer nada o lanzar una excepcion porque esta subclase no utiliza este metodo
	    throw new UnsupportedOperationException("Este metodo no es necesario en esta subclase");
	}

	//Getters
	public int getNumeroDeContrato() {
		return numeroDeContrato;
	}

	public String getMedioDePago() {
		return medioDePago;
	}
	
	//Setters
	public void setNumeroDeContrato(int numeroDeContrato) {
		this.numeroDeContrato = numeroDeContrato;
	}

	public void setMedioDePago(String medioDePago) {
		this.medioDePago = medioDePago;
	}
}
