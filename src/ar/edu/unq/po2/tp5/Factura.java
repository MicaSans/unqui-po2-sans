package ar.edu.unq.po2.tp5;

public abstract class Factura implements Agencia {

	//Variables de instancia
	private String nombre;
	private Double importe;

	//Constructor
	public Factura(String nombreFactura, Double importeFactura) {
		this.setNombre(nombreFactura);
		this.setImporte(importeFactura);
	}
	
	//Metodos
	@Override
	public abstract void registrarPago(Factura factura);

	abstract Double calcularMontoAPagar();

	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}
}
