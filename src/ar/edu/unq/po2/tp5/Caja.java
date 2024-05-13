package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	//Variables de instancia
	private List<Producto> productosVendidos;
	private Double montoTotal;
	//Agregado para ejercicio 2
	private List<Factura> facturasCobradas;
	
	//Constructor
	public Caja() {
	this.productosVendidos = new ArrayList<Producto>();
	this.setMontoTotal(0d);
	//Agregado para ejercicio 2
	this.facturasCobradas = new ArrayList<Factura>();
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
	//Agregado para ejercicio 2
	public void registrarFactura(Factura factura) {
		facturasCobradas.add(factura);
		this.setMontoTotal(this.getMontoTotal() + factura.getImporte());
	}

	//Getters y setters
	public Double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Double montoTotal) {
		this.montoTotal = montoTotal;
	}

}
