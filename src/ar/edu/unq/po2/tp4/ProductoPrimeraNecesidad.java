package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	
	//Constructor
	public ProductoPrimeraNecesidad(String nombreDeProducto, int precioDeProducto, boolean esPreciosCuidados) {
		super(nombreDeProducto, precioDeProducto, esPreciosCuidados);
		this.setPrecio(precioDeProducto * 0.9);
	}

}
