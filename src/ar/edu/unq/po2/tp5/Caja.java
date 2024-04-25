package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	//Variables de instancia
	private List<Producto> productosVendidos;
	private Double montoTotal;
	
	//Constructor
	public Caja() {
	this.productosVendidos = new ArrayList<Producto>();
	this.setMontoTotal(0d);
	}
	
	//Metodos		
	public void registrarProducto(Producto producto) {
		productosVendidos.add(producto);
		if(producto.getStock() == 0) {
			System.out.println("Producto sin stock");
		}
		else {
			producto.setStock(producto.getStock() - 1);
		}
		this.setMontoTotal(this.getMontoTotal() + producto.getPrecioBase());
	}

	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
