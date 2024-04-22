package ar.edu.unq.po2.tp4;

public class Producto {
	
	//Variables de instancia
	private String nombre;
	private double precio;
	private boolean preciosCuidados;
	
	//Constructor con valor de preciosCuidados por defecto false
	public Producto (String nombreDeProducto, double precioDeProducto) {
		this.nombre = nombreDeProducto;
		this.precio = precioDeProducto;
		this.preciosCuidados = false; //Valor por defecto
	}
	
	//Constructor que permite especificar preciosCuidados para alguno que lo sea
	public Producto (String nombreProductoPC, double precioProductoPC, boolean preciosCuidados) {
		this(nombreProductoPC, precioProductoPC); //Llama al constructor principal
		this.preciosCuidados = preciosCuidados; //Especifica el valor del producto de preciosCuidados
	}
	
	//Metodos
	public boolean esPrecioCuidado() {
		return this.preciosCuidados;
	}
	
	public double aumentarPrecio(double aumento) {
		this.precio = this.precio + aumento;
		return this.precio;
	}

	//Getters
	public double getPrecio() {
		return precio;
	}

	public String getNombre() {
		return nombre;
	}

	//Setters
	public void setPrecio(double precioDeProducto) {
		this.precio = precioDeProducto;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
