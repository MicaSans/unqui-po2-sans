package ar.edu.unq.poo2.tp2;

import java.util.ArrayList;
import java.util.List;


public class Empresa {
	//Variables de instancia
	private String nombreEmpresa;
	private String cuit;
	private List<Empleado> empleados; //Lista de empleados totales de la empresa
	private List<ReciboDeSueldo> recibosDeSueldo;
	
	//Constructor
	public Empresa(String nombre, String cuitEmpresa) {
		this.setNombre(nombre);
		this.setCuit(cuitEmpresa);
		this.empleados = new ArrayList<Empleado>();
	}
	
	//Getters
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	
	public String getCuitEmpresa() {
		return cuit;
	}

	public List<ReciboDeSueldo> getRecibosDeSueldo() {
		return recibosDeSueldo;
	}
	
	public List<Empleado> getEmpleados(){
		return empleados;
	}
	
	//Setters
	private void setCuit(String cuitEmpresa) {
		this.cuit = cuitEmpresa;
	}

	private void setNombre(String nombre) {
		this.setNombreEmpresa(nombre);
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	public void setRecibosDeSueldo(List<ReciboDeSueldo> recibosDeSueldo) {
		this.recibosDeSueldo = recibosDeSueldo;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	
	//Metodos
	public float totalSueldosNetos() {
		float totalNetos = 0;
		for (Empleado empleado : empleados) {
			totalNetos += empleado.calcularSueldoNeto();
		}
		return totalNetos;
	}
	
	public float totalSueldosBrutos() {
		float totalBrutos = 0;
		for (Empleado empleado : empleados) {
			totalBrutos += empleado.calcularSueldoBruto();
		}
		return totalBrutos;
	}
	
	public float totalRetenciones() {
		float totalRet = 0;
		for (Empleado empleado : empleados) {
			totalRet += empleado.calcularRetenciones();
		}
		return totalRet;
	}
	
	public int totalEmpleados() {
		return empleados.size();
	}
	
	public void contratarEmpleado(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void desvincularEmpleado(Empleado empleado) {
		empleados.remove(empleado);
	}
}
