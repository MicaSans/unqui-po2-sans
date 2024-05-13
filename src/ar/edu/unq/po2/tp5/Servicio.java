package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {

	//Variables de instancia
	private int cantidadUnidades;
	
	//Constructor
	public Servicio(String nombreServicio, Double costoUnitario, int cantidadUnidades) {
		super(nombreServicio, costoUnitario);
		this.setCantidadUnidades(cantidadUnidades);
	}

	//Metodos
	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Registrar servicio: " + this.getNombre() + " con importe: " + this.calcularMontoAPagar());
	}
	
	@Override
	public Double calcularMontoAPagar() {
		Double montoTotal = this.getImporte() * this.cantidadUnidades;
		return montoTotal;
	}

	//Getters y setters
	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}

}
