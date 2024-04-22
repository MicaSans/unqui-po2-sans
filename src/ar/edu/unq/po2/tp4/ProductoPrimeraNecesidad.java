package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	//Variable de instancia
	private int descuento;
	
	//Constructor con valor de preciosCuidados por defecto false
	public ProductoPrimeraNecesidad(String nombreDeProducto, double precioDeProducto) {
		super(nombreDeProducto, precioDeProducto);
		this.setPrecio(precioDeProducto * 0.9);
	}

	//Constructor que permite especificar preciosCuidados para alguno que lo sea
	public ProductoPrimeraNecesidad(String nombreDeProducto, double precioDeProducto, boolean esPreciosCuidados) {
		super(nombreDeProducto, precioDeProducto, esPreciosCuidados);
		this.setPrecio(precioDeProducto * 0.9);
	}
	
	//Agrego constructor con valor de preciosCuidados por defecto false que permite especificar descuento a aplicar para punto 2
	public ProductoPrimeraNecesidad(String nombreDeProducto, double precioDeProducto, int descuentoAAplicar) {
		super(nombreDeProducto, precioDeProducto);
		this.descuento = descuentoAAplicar;
	}
	
	//Agrego constructor que permite especificar preciosCuidados y descuento a aplicar para punto 2
	public ProductoPrimeraNecesidad(String nombreDeProducto, double precioDeProducto, boolean esPreciosCuidados, int descuentoAAplicar) {
		super(nombreDeProducto, precioDeProducto, esPreciosCuidados);
		this.descuento = descuentoAAplicar;
	}
	
	//Metodos
	@Override
	public double getPrecio() {
		double precioConDescuento = super.getPrecio() - ((super.getPrecio() * this.descuento) / 100);
		return precioConDescuento;
	}
}
