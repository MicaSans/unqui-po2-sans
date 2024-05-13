package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {

	//Variables de instancia
	private Double tasaImpuesto;
	
	//Constructor
	public Impuesto(String nombreImpuesto, Double tasaImpuesto) {
		super(nombreImpuesto, tasaImpuesto);
		this.setTasaImpuesto(tasaImpuesto);
	}

	//Metodos
	@Override
	public void registrarPago(Factura factura) {
		System.out.println("Registrar impuesto: " + this.getNombre() + " con importe: " + this.calcularMontoAPagar());
	}
	
	@Override
	Double calcularMontoAPagar() {
		return this.getTasaImpuesto();
	}

	//Getters y setters
	public Double getTasaImpuesto() {
		return tasaImpuesto;
	}

	public void setTasaImpuesto(Double tasaImpuesto) {
		this.tasaImpuesto = tasaImpuesto;
	}

}
