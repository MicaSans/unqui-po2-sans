package ar.edu.unq.po2.tp5;

public class Producto {

	//Variables de instancia
	private String nombre;
	private Double precioBase;
	private int stock;
	
	//Constructor
	public Producto(String nombreProducto, Double precioProducto, int stockProducto) {
		this.setNombre(nombreProducto);
		this.setPrecioBase(precioProducto);
		this.setStock(stockProducto);
	}

	//Getters y setters
	public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
