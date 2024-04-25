package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	//Variable de instancia
	private int descuentoIva;
	
	//Constructor
	public ProductoCooperativa(String nombreProducto, Double precioProducto, int stockProducto, int descuentoIvaProducto) {
		super(nombreProducto, precioProducto, stockProducto);
		this.setDescuentoIva(descuentoIvaProducto);
	}
	
	//Metodos
	//public Double calcularPrecio(int descuento) {
	//	setPrecioBase(this.getPrecioBase() - ((this.getPrecioBase() * this.getDescuentoIva()) / 100));
	//	return this.getPrecioBase();
	//}
	@Override
	public Double getPrecioBase() {
		return super.getPrecioBase() - ((super.getPrecioBase() * this.getDescuentoIva() / 100));
	}

	//Setters y getters
	public int getDescuentoIva() {
		return descuentoIva;
	}

	public void setDescuentoIva(int descuentoIva) {
		this.descuentoIva = descuentoIva;
	}

}
