package ar.edu.unq.poo2.tp1;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombreEmpresa;
	private String cuit;
	private List<Empleado> empleados; //Lista de empleados de la empresa
	
	public Empresa(String nombre, String cuitEmpresa) {
		this.setNombre(nombre);
		this.setCuit(cuitEmpresa);
		this.empleados = new ArrayList<Empleado>();
		
	}
	
	private void setCuit(String cuitEmpresa) {
		// TODO Auto-generated method stub
		this.cuit = cuitEmpresa;
	}

	private void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombreEmpresa = nombre;
	}

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
}
