package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	//Variables de instancia
	private String nombre;
	private String direccion;
	List<Producto> productos;
	
	//Constructor
	public Supermercado (String nombreDelSuper, String direccionDelSuper) {
		this.setNombre(nombreDelSuper);
		this.setDireccion(direccionDelSuper);
		this.productos = new ArrayList<Producto>();
	}
	
	//Metodos
	public int cantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	
	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
	}
	
	public double precioTotal() {
		double precioTotal = 0;
		for (Producto producto : productos) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}

	//Getters
	public List<Producto> getProductos() {
		return productos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	//Setters
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
